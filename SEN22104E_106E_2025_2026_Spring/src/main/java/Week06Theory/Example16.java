/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali.nizam
 */
public class Example16 {
    public static void main(String[] args) {
        String regexPattern="([A-z][0-9]){2}";
        String searchString="1.Fatih a1h72 Sultan s2 Mehmet";
        Pattern pattern= Pattern.compile(regexPattern);
        Matcher m=pattern.matcher(searchString);
        while(m.find()){
            System.out.println(m.group()+" "+m.start()+":"+m.end());
        }
        
        
    }
}
