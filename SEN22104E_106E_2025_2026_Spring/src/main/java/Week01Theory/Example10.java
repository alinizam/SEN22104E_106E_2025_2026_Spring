/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ali.nizam
 */
public class Example10 {

    public static void main(String[] args) {
            
    }
    
    static void createFormUsingLambda() {
        JFrame f = new JFrame();
        JButton b = new JButton();
        ActionListener l = (e) -> {
                f.getContentPane().setBackground(Color.red);
            };
       
        b.addActionListener(l);
    }

    static void createFormUsingAnonymListener() {
        JFrame f = new JFrame();
        JButton b = new JButton();
        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.red);
            }
        };
        b.addActionListener(l);
    }
     static void createFormUsingLocalListener() {
        JFrame f = new JFrame();
        JButton b = new JButton();
        //local class
        class MyListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.red);
            }
        };
        
        b.addActionListener(new MyListener());
    }
}
