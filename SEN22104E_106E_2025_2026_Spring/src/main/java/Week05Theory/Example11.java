/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example11 {
    public static void main(String[] args) {
        int minSalary=50000;
        int salary=40000;
        try {
            if (salary<minSalary){
                 throw new SalaryException(minSalary-salary);
            }
        } catch (SalaryException e) {
            System.out.println("The salary is less exception: "+e.gapOfSalary);
        }
        
        
    }
}
