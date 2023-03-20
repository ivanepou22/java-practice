import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String x = "let he";
        String y = "he let";

        x = x.toLowerCase();
        y = y.toLowerCase();

       x = x.replace(" ","");
        y = y.replace(" ","");

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a,b);
        if (result) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
