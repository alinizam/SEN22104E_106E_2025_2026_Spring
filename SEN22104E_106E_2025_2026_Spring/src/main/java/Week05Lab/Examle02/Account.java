/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Examle02;

/**
 *
 * @author ali.nizam
 */
public class Account {

    int totalMoney;

    public Account(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    void withDraw(int amount) {
        if (totalMoney - amount < 0) {
            throw new InsufficientFundException(totalMoney, amount);
        }
        totalMoney -= amount;
    }
}
