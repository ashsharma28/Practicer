package edu.ashish.AITRial.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by admin on 12-Nov-16.
 */
public class TicTacToe {

    static int counter = 0;
    static JFrame frame;
    public JButton[] buttons;
    String XO[] = new String[]{"X", "O"};
    int alternatingIndex = 1;
    boolean array[] = new boolean[]{false, false, false, false, false, false, false, false, false};
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel mainPanel;

    //637482105DRAW - 5
    // 48593216
    private JButton resetButton;


    public TicTacToe() {

        button1 = new JButton();
        button2 = new JButton();
        $$$setupUI$$$();

        buttons = new JButton[9];
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;


        ActionListener listener = new ActionListener() {


            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                source.setText(getNextString());
                source.setEnabled(false);

                System.out.print(Integer.parseInt(source.getName()));


                boolean isWon = checkForWinner(source);
                if (isWon) {
                    GeneralDialog dialog = new GeneralDialog();
                    frame.setAlwaysOnTop(false);
                    dialog.setMessage(source.getText().toUpperCase() + " WON !!");
                    dialog.setSize(new Dimension(300, 200));

                    dialog.setVisible(true);
                    frame.setAlwaysOnTop(true);

                    //RESET
                    for (JButton x : buttons) {
                        x.setText("");
                        x.setEnabled(true);
                    }

                    for (int i = 0; i < array.length; i++) {
                        array[i] = false;
                    }

                    alternatingIndex = 1;

                    System.out.println("WON - " + counter++);
                    return;
                }


                boolean isDraw = checkForDraw(source);

                if (isDraw && !isWon) {
                    GeneralDialog dialog = new GeneralDialog();
                    frame.setAlwaysOnTop(false);
                    dialog.setMessage("Draw");
                    dialog.setSize(new Dimension(300, 200));

                    for (JButton x : buttons) {
                        x.setText("");
                        x.setEnabled(true);
                    }

                    for (int i = 0; i < array.length; i++) {
                        array[i] = false;
                    }

                    alternatingIndex = 1;

                    dialog.setVisible(true);
                    frame.setAlwaysOnTop(true);
                    System.out.println("DRAW - " + counter++);
                }


            }


        };


        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);


        resetButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");


                alternatingIndex = 1;

                for (int i = 0; i < array.length; i++) {
                    array[i] = false;
                }


                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("TicTacToe");
        TicTacToe ticTacToe = new TicTacToe();
        frame.setContentPane(ticTacToe.mainPanel);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private String getNextString() {
        return XO[(alternatingIndex = alternatingIndex + 1) % 2];
    }

    private boolean checkForWinner(JButton source) {

        boolean toReturn = false;
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        arrayList.add("147");
        arrayList.add("258");
        arrayList.add("369");
        arrayList.add("159");
        arrayList.add("357");

        String text = source.getText();

        for (String x : arrayList) {
            if (x.contains(source.getName())) {

                int countForMatch = 0;
                for (char y : x.toCharArray()) {
                    if (buttons[Integer.parseInt(y + "") - 1].getText().equals(text)) {
                        countForMatch++;
                    }
                }


                if (countForMatch == 3) {
                    toReturn = true;
                    break;
                }
            }
        }


        return toReturn;
    }

    private boolean checkForDraw(JButton source) {


        array[Integer.parseInt(source.getName()) - 1] = true;


        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            boolean x = array[i];
            result = x & result;
        }

        if (result == true) {
            return true;
        } else return false;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createTitledBorder("TicTacToe"));
        button1.setBackground(new Color(-6295428));
        button1.setName("1");
        button1.setPreferredSize(new Dimension(100, 100));
        button1.setText("");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button1, gbc);
        button2.setBackground(new Color(-6295428));
        button2.setName("2");
        button2.setPreferredSize(new Dimension(100, 100));
        button2.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button2, gbc);
        button3 = new JButton();
        button3.setBackground(new Color(-6295428));
        button3.setName("3");
        button3.setPreferredSize(new Dimension(100, 100));
        button3.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button3, gbc);
        button4 = new JButton();
        button4.setBackground(new Color(-6295428));
        button4.setName("4");
        button4.setPreferredSize(new Dimension(100, 100));
        button4.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button4, gbc);
        button5 = new JButton();
        button5.setBackground(new Color(-6295428));
        button5.setName("5");
        button5.setPreferredSize(new Dimension(100, 100));
        button5.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button5, gbc);
        button6 = new JButton();
        button6.setBackground(new Color(-6295428));
        button6.setName("6");
        button6.setPreferredSize(new Dimension(100, 100));
        button6.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button6, gbc);
        button7 = new JButton();
        button7.setBackground(new Color(-6295428));
        button7.setName("7");
        button7.setPreferredSize(new Dimension(100, 100));
        button7.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button7, gbc);
        button8 = new JButton();
        button8.setBackground(new Color(-6295428));
        button8.setName("8");
        button8.setPreferredSize(new Dimension(100, 100));
        button8.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button8, gbc);
        button9 = new JButton();
        button9.setBackground(new Color(-6295428));
        button9.setEnabled(true);
        button9.setName("9");
        button9.setPreferredSize(new Dimension(100, 100));
        button9.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(button9, gbc);
        resetButton = new JButton();
        resetButton.setText("Reset");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(resetButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
