/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        try {
            int a=5,b=1;
            int c=a/b;
            int[] numbers={1,5,6};
            c=numbers[5];
            Object o=null;
            o.getClass(); 
        } catch (ArithmeticException e) {
            System.out.println("1 "+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException|ArrayStoreException e){
            System.err.println("2 Array specific exception occured "+e.getMessage());
        } catch (Exception e){
            System.err.println("3 "+e.getMessage());
        }
    }
}
