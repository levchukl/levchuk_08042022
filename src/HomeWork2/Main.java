package HomeWork2;

public class Main {
    public static void main(String[] args) {
        String st = "I    am      learning     Java   Core";
        String result = st.replaceAll(" {2,}", " ");
        System.out.println(result);
    }
}
