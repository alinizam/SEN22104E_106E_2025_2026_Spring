/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Theory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali.nizam
 */
public class RegexClass {
    static void find(String regexPattern,String searchString){
        Pattern pattern= Pattern.compile(regexPattern);
        Matcher m=pattern.matcher(searchString);
        while(m.find()){
            System.out.println(m.group()+" "+m.start()+":"+m.end());
        }
    
    }
}
