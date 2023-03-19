public class Palindrome {
    public static void main(String[] args) {
        String x  = "tet";
        System.out.println(palindromeString(x));
    }

    private static Boolean palindromeString(String x) {
        char[] charString = x.toCharArray();
        int size = charString.length;
        char[] a = new char[size];

        //reverse the String
        int i = 0;
        while (i < size) {
            a[size-1-i] = charString[i];
            i++;
        }

        //check for equality
        int j = 0;
        while (j < size) {
            if ( a[j] != charString[j]) {
                return false;
            }
            j++;
        }
        return  true;
    }
}
