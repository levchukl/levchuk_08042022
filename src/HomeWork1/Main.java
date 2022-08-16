package HomeWork1;

import java.util.*;

import static HomeWork1.LongestWord.max;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String st = sc.nextLine();
        List<String> strings = Arrays.asList(st.split(" "));
        String maxWord=max(st);
        StringBuilder reverseWord = new StringBuilder();
        reverseWord.append(strings.get(1));
        reverseWord.reverse();
        System.out.println(maxWord);
        System.out.println(maxWord.length());
        System.out.println(reverseWord);


    }
}
