package ru.mirea.task11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Task11_3 extends JFrame implements MouseListener{
    Label l;
    private JPanel Top = new JPanel();
    private JPanel Bottom = new JPanel();
    Task11_3(){
        addMouseListener(this);

        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        add(Top, BorderLayout.NORTH);
        add(Bottom, BorderLayout.SOUTH);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == this.Top)
            l.setText("Mouse Entered Top");
        else if (e.getSource() == this.Bottom)
            l.setText("Mouse Entered Bottom");
    }
    public void mouseExited(MouseEvent e) {
        java.awt.Point p = new java.awt.Point(e.getLocationOnScreen());
        SwingUtilities.convertPointFromScreen(p, e.getComponent());
        if(e.getComponent().contains(p)) {return;}
            l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public static void main(String[] args) {
        Task11_3 MY = new Task11_3();
    }
}
