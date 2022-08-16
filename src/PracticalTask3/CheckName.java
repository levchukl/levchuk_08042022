package PracticalTask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckName {
    public static boolean isValidUserName(String name){
        String regex = "^[A-Za-z]\\w{2,24}$";
        Pattern p = Pattern.compile(regex);
        if (name == null){
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
