/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        System.out.println("Ahmet".compareTo("Ahmet"));
        System.out.println("Ahmet".compareTo("Adem"));
        System.out.println("Adem".compareTo("Ahmet"));
        
        String words[]={"Zeki","Ahmet","Mehmet","Adem","Kemal"};
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                String temp="";
                if(words[i].compareTo(words[j])>0){
                    temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
