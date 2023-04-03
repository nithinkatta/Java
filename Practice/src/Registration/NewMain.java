package Registration;

import javax.swing.*;
public class NewMain
{
    public static void main(String[] args)
    {
        JFrame fm = new JFrame();
        
        JLabel jl = new JLabel("Hello world");
        
        JTextField tx = new JTextField();
        tx.setSize(50, 50);
        fm.add(tx);
        fm.add(jl);
        fm.setSize(800, 500);
        fm.setVisible(true);

            
    }
}