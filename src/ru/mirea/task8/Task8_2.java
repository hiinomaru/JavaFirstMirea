package ru.mirea.task8;

import javax.swing.*;
import java.net.URL;

public class Task8_2 extends JFrame {

    public Task8_2() {
        JLabel[] l = new JLabel[72];
        for (Integer i = 1; i < 73; i++) {
            URL p = getClass().getResource("/YHjl-"
                    + i + " (перетянутый).jpg");
            l[i - 1] = new JLabel(new ImageIcon(p), SwingConstants.CENTER);
        }
        setContentPane(l[1]);
        pack();
        setVisible(true);
        int i = 0;
        while (true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            setContentPane(l[i % 72]);
            pack();
            ++i;
        }
    }

    public static void main(String args[]) {
        new Task8_2();
    }
}