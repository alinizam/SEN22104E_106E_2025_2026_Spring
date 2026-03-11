/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class SalaryException extends RuntimeException{
    int gapOfSalary;

    public SalaryException(int gapOfSalary) {
        this.gapOfSalary = gapOfSalary;
    }
    
}
