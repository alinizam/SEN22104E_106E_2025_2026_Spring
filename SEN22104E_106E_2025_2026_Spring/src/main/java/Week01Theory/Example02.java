/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.add(new JTextField("Hello"));
        f.add(new JButton("Hello"));
        f.add(new JButton("Hello1"));
        f.add(new JButton("Hello2"));
        f.add(new JButton("Hello3"));
        
        f.setLayout(new FlowLayout());
        f.pack();
    }
}
