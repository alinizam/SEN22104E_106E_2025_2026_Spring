/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Examle02;

/**
 *
 * @author ali.nizam
 */
public class InsufficientFundException extends RuntimeException{
    int totalAmount, requestedAmount;

    public InsufficientFundException(int totalAmount, int requestedAmount) {
        this.totalAmount = totalAmount;
        this.requestedAmount = requestedAmount;
    }
    int requiredBalance(){
        return totalAmount-requestedAmount;
    }
    
}
