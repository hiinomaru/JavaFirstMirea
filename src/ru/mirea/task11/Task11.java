package ru.mirea.task11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task11 {

    public static class SwingControlDemo {
        private JFrame mainFrame;
        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;
        private JTextArea area;
        private int N = (int) (Math.random() * 20);
        private int S = 3;

        public SwingControlDemo(){
            prepareGUI();
        }
        public static void main(String[] args){
            SwingControlDemo swingControlDemo = new SwingControlDemo();
            swingControlDemo.showEventDemo();
        }
        private void prepareGUI(){
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            headerLabel = new JLabel("",JLabel.CENTER );
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame.add(headerLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }
        private void showEventDemo(){
            headerLabel.setText("Ваше число");

            area = new JTextArea("Ваше число", 1, 8);
            area.setFont(new Font("Dialog", Font.PLAIN, 14));
            area.setTabSize(10);

            JButton okButton = new JButton("OK");
            JButton reButton = new JButton("RESTART");

            okButton.setActionCommand("OK");
            reButton.setActionCommand("RESTART");

            okButton.addActionListener(new ButtonClickListener());
            reButton.addActionListener(new ButtonClickListener());

            controlPanel.add(area);
            controlPanel.add(okButton);
            controlPanel.add(reButton);
            mainFrame.setVisible(true);
        }
        private class ButtonClickListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();

                if( command.equals( "OK" ))  {
                    int A = Integer.parseInt((area.getText()));
                    if ((N == A) && (S > 0))
                        statusLabel.setText("MATCH!!!");
                    else if ((N < A) && (S > 0))
                        statusLabel.setText("Wrong answer, N < " + A);
                    else if ((N > A) && (S > 0))
                        statusLabel.setText("Wrong answer, N > " + A);
                    area.setText("");
                    if (S < 1)
                        statusLabel.setText("Attempts runs out. Restart the game");
                    S--;
                    //statusLabel.setText("Ok Button clicked." + N);
                }
                else if ( command.equals( "RESTART" )){
                    statusLabel.setText("RESTARTED");
                    N = (int) (Math.random() * 20);
                    S = 3;
                }
            }
        }
    }
}
