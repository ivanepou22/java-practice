public class Palindrome {
    public static void main(String[] args) {
        String x  = "too Hot to HOOT";
        //too hot to hoot or too Hot to HOOT
        System.out.println(palindromeString(x));
    }

    private static Boolean palindromeString(String x) {
        //remove spaces in the string
        x = x.replace(" ", "");
        //convert to lower case.
        x = x.toLowerCase();
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
