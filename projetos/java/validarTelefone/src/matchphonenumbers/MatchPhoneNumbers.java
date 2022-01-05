/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchphonenumbers;

import java.util.regex.Pattern;

/**
 *
 * @author VP
 */
public class MatchPhoneNumbers {

    public static void main(String[] args) {
String[] testStrings = {"antony","43996916631"};

Pattern p = Pattern.compile("^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$");
for (String str : testStrings) {
    if (p.matcher(str).matches()) {
        System.out.printf("%s is valid%n", str);
    } else {
        System.out.printf("%s is not valid%n", str);    
    }
}
    }
    
}
