package HomeWork1;

public class LongestWord {
    static String max(String par){
        String[]words=par.split(" ");
        String resString="";
        for(String word:words){
           if (word.length()>resString.length())
               resString=word;
        }
        return (resString);
    }


}
