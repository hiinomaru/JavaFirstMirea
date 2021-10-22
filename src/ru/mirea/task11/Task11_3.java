package ru.mirea.task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Task11_3 extends JLabel{
    public static void main(String[] args) {
        JLabel R = new JLabel("red");
        R.setBackground(Color.RED);
        R.setOpaque(true);
        JLabel G = new JLabel("green");
        G.setBackground(Color.GREEN);
        G.setOpaque(true);
        JLabel B = new JLabel("blue");
        B.setBackground(Color.BLUE);
        B.setOpaque(true);
        JLabel Y = new JLabel("yellow");
        Y.setBackground(Color.YELLOW);
        Y.setOpaque(true);
        JFrame main = new JFrame();
        main.setSize(600,600);
        GridLayout layout = new GridLayout(2, 2);
        main.setLayout(layout);
        main.add(R);
        main.add(G);
        main.add(B);
        main.add(Y);
        main.setVisible(true);
        MouseListener EEE = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, ((JLabel)e.getSource()).getText());
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        R.addMouseListener(EEE);
        G.addMouseListener(EEE);
        B.addMouseListener(EEE);
        Y.addMouseListener(EEE);
    }
}
