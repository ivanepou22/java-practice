public class UpperCaseToLowerCase {
    public static void main(String[] args) {
        String l = "HELLO WORLD";
        char[] x = l.toCharArray();
        int size = x.length;
        int i = 0;
        while (i < size) {
            if (x[i] != ' ') {
                x[i] = (char) (x[i] + 32);
            }
            i++;
        }
        System.out.println(x);
    }
}
