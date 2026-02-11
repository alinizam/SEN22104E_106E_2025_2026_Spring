/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        for (int i = 0; i < 10; i++) {
            f.add(new JButton(""+i));
        }
        f.setLayout(new FlowLayout());
        f.pack();
        f.setVisible(true);
    }
}
