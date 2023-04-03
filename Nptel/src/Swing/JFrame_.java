package Swing;
import javax.swing.*;
public class JFrame_
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("new one");
        JButton b = new JButton("click on");
        f.setSize(500, 300);
        f.add(b);
        f.setVisible(true);
    }
}