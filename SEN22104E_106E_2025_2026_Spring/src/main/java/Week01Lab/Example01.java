/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(300,300);
        f.add(new JLabel("Label 1"));
        f.add(new JButton("Button 1"));
        JButton jb=new JButton();
        jb.setText("Button 2");
        f.add(jb);
        f.add(new JTextField("Text 1"));
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
