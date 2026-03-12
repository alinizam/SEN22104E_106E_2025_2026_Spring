/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        /*Print the location of the first zero number in a matrix on the screen using exception handling.
        */
        int[][] numbers={{1,5,8},{1,1,1},{0,2,2}};
        try {
             for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]==0){
                    throw new ArithmeticException(i+" : "+j);
                }
            }
        }
            
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
       
    }
    
}
