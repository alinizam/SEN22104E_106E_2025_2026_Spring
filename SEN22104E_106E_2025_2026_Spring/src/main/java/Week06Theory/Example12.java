/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.salary=5;
        increaseSalary(e);
        System.out.println(e.salary);
        
        String s="Fatih";
        changeString(s);
        System.out.println(s);
    }
    static void increaseSalary(Employee e){
        e.salary++;
    }
    static void changeString(String s){
        s=s+"a";
    }
}
