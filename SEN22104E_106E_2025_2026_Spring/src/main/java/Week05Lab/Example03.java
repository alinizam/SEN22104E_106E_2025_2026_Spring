/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        String[] words={"a","b","c"};
        System.out.println(concatWords(words));
        
        
        char[] chars=convertToChar("Ahmet");
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
    static void findWord(){
        String s="Fatih Sultan ";
        int previousSpace=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                System.out.println(s.substring(previousSpace, i));
                previousSpace=i+1;
            }
        }
        
    }
    static String concatWords(String[] words){
        String s="";
        for (String word : words) {
            s+=word;
        }
        return s;
    }
    static char[] convertToChar(String words){
         char[] chars=new char[words.length()];
         for (int i = 0; i < chars.length; i++) {
            chars[i]=words.charAt(i);
        }
         return chars;
    }
}
