public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        String l = "HELLO";
        char[] x = l.toCharArray();
        int size = x.length;
        int i = 0;
        while (i < size) {
            x[i] = (char) (x[i]+32);
            i++;
        }
        System.out.println(x);
    }
}
