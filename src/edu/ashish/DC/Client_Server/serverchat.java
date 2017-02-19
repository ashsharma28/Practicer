package edu.ashish.DC.Client_Server;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class serverchat extends Frame implements ActionListener {
    TextArea t;
    TextField txtmsg;
    Socket c;
    ServerSocket s;
    DataInputStream dis;
    DataOutputStream dos;

    public serverchat() {
        super("Server Screen\n\n");
        setLayout(new BorderLayout());
        t = new TextArea(10, 30);
        add(t, BorderLayout.CENTER);
        txtmsg = new TextField(30);
        add(txtmsg, BorderLayout.SOUTH);
        txtmsg.addActionListener(this);
        setSize(250, 250);
        show();


        try {
            s = new ServerSocket(1500, 5);
            t.append("server started quit to stop\n\n");
            while (true) {
                c = s.accept();
                dis = new DataInputStream(c.getInputStream());
                dos = new DataOutputStream(c.getOutputStream());
                while (true) {
                  /*  String msg = *//*dis.readLine();*//*new BufferedReader(new InputStreamReader(dis).read();*/
                    String msg = (String) dis.readUTF();
                    t.append("\n Client  says " + msg);
                }
            }

        } catch (IOException e1) {
        }

    }

    public static void main(String a[]) {
        new serverchat();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String msg = txtmsg.getText();
            dos.writeBytes(msg + "\n");
            if (msg.equals("quit")) {
                System.exit(0);
            }
            txtmsg.setText("");
        } catch (IOException e2) {
        }
    }

}
