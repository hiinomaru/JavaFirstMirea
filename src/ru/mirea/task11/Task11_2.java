package ru.mirea.task11;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.Font.*;

public class Task11_2 implements MenuListener {
    private JTextArea area;
    private JPanel controlPanel;
    JFrame myFrame = null;
    public static void main(String[] a) {
        (new Task11_2()).test();
    }
    private void test() {
        area = new JTextArea("Your Text", 1, 8);
        area.setFont(new Font("Dialog", PLAIN, 14));
        area.setTabSize(10);
        myFrame = new JFrame("Menu Listener Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(50,50,250,150);
        myFrame.setContentPane(new JDesktopPane());
        myFrame.setSize(400,400);
        myFrame.setLayout(new GridLayout(3, 1));

        JMenuBar myMenuBar = new JMenuBar();
        JMenu myMenu = getFontMenu();
        myMenu.addMenuListener(this);
        myMenuBar.add(myMenu);

        myMenu = getColorMenu();
        myMenu.addMenuListener(this);
        myMenuBar.add(myMenu);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(area);
        myFrame.add(area);
        myFrame.setJMenuBar(myMenuBar);
        myFrame.setVisible(true);
    }
    private JMenu getFontMenu() {
        JMenu myMenu = new JMenu("Font");
        JMenuItem myItem1 = new JMenuItem(new AbstractAction("Bold") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(area.getFont().deriveFont(Font.BOLD));
            }
        });
        myMenu.add(myItem1);
        JMenuItem myItem2 = new JMenuItem(new AbstractAction("Plain") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(area.getFont().deriveFont(PLAIN));
            }
        });
        myMenu.add(myItem2);
        JMenuItem myItem3 = new JMenuItem(new AbstractAction("Hanging") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setFont(area.getFont().deriveFont(HANGING_BASELINE));
            }
        });
        myMenu.add(myItem3);
        return myMenu;
    }
    private JMenu getColorMenu() {
        JMenu myMenu = new JMenu("Color");
        JMenuItem myItem1 = new JMenuItem(new AbstractAction("Red") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.RED);
            }
        });
        myMenu.add(myItem1);
        JMenuItem myItem2 = new JMenuItem(new AbstractAction("Green") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.GREEN);
            }
        });
        myMenu.add(myItem2);
        JMenuItem myItem3 = new JMenuItem(new AbstractAction("Blue") {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setForeground(Color.BLUE);
            }
        });
        myMenu.add(myItem3);
        return myMenu;
    }
    public void menuSelected(MenuEvent e) {
        JMenu myMenu = (JMenu) e.getSource();
    }
    public void menuDeselected(MenuEvent e) {
        JMenu myMenu = (JMenu) e.getSource();
    }
    public void menuCanceled(MenuEvent e) {
    }
}
