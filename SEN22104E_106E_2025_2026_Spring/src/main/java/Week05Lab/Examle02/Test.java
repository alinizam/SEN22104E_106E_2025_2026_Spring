/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Examle02;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        try{
            Account a=new Account(100);
        
        a.withDraw(50);
        System.out.println(a.totalMoney);
        a.withDraw(30);
        System.out.println(a.totalMoney);
         a.withDraw(30);
        System.out.println(a.totalMoney);
        }catch (InsufficientFundException e){
            System.out.println("The gap between requested and total ="+e.requiredBalance());
        }
    }
}
