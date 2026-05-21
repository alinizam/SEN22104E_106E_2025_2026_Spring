/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    //Recursive Algorithm
    public static void main(String[] args) {
        write_n_m_recursive(10,15);
    }
    static void write_n_m(int n,int m){
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
    
     static void write_n_m_recursive(int n,int m){
         if (n==m) return;
            System.out.println(n);
            n++;
            write_n_m_recursive(n,m);
            
        
    }
}
