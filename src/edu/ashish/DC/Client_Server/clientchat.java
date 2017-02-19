package edu.ashish.DC.Client_Server;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class clientchat extends Frame implements ActionListener {
    TextArea t;
    TextField txtmsg;
    Socket c;
    DataInputStream dis;
    DataOutputStream dos;

    public clientchat() {
        super("Client Screen\n\n");
        setLayout(new BorderLayout());
        t = new TextArea(10, 30);
        add(t, BorderLayout.CENTER);
        txtmsg = new TextField(30);
        add(txtmsg, BorderLayout.SOUTH);
        txtmsg.addActionListener(this);
        setSize(250, 250);
        show();


        try {
            c = new Socket("192.168.137.2", 8089);
            t.append("client started quit to stop\n\n");

            dis = new DataInputStream(c.getInputStream());
            dos = new DataOutputStream(c.getOutputStream());
            while (true) {
                String msg = dis.readLine();
                t.append("server  says " + msg);
                //t.append("Server ssetLineWrap(true);
                //t.setWrapStyleWord(true)
            }

        } catch (IOException e1) {
        }

    }

    public static void main(String a[]) {
        new clientchat();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String msg = txtmsg.getText();
            dos.writeUTF(msg + "\n");
            if (msg.equals("quit")) {
                System.exit(0);
            }
            txtmsg.setText("");
        } catch (IOException e2) {
        }
    }

}
