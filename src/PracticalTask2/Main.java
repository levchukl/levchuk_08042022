package PracticalTask2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your surname: ");
        System.out.println("Enter your name: ");
        System.out.println("Enter your patronymic: ");
        String surname = sc.nextLine();
        String name = sc.nextLine();
        String patronymic = sc.nextLine();

    }
    public static String outputSurnameAndInitials(String surname, String name, String patronymic){
        return surname + " " + name.charAt(0) + "." + patronymic.charAt(0) + ".";
    }
}
