package PracticalTask3;

import static PracticalTask3.CheckName.isValidUserName;

public class Main {
    public static void main(String[] args) {
        String st1 = "Marik";
        String st2 = "_56fyhijo";
        String st3 = "DG";
        String st4 = "Liudmyla123";
        String st5 = "Ivan";
        System.out.println(isValidUserName(st1));
        System.out.println(isValidUserName(st2));
        System.out.println(isValidUserName(st3));
        System.out.println(isValidUserName(st4));
        System.out.println(isValidUserName(st5));
    }


}
