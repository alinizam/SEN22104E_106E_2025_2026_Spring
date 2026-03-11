/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example09 {
    public static void main(String[] args) {
       mySystem();        
    }
    static void mySystem(){
        try {
            getSalary();
            setNewSalary();
            saveSalaryToDatabase();
        } catch (Exception e) {
            System.out.println("The new salary is not setted");
        }
        
    }
    static void getSalary(){
        System.out.println("Get salary");
    }
    static void setNewSalary(){
        int minSalary=50000;
        int salary=0;
        if (salary<minSalary){
            throw new ArithmeticException("A salary must be higher than min salary");
           // System.out.println("A salary must be higher than min salary");
        }
        System.out.println("Get New salary");
    }
    static void saveSalaryToDatabase(){
        System.out.println("The salary is saved");
    }
}
