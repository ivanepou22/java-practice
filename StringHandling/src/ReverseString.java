public class ReverseString {
    public static void main(String[] args) {
        String x  = "Hello People";
        char[] charString = x.toCharArray();
        int size = charString.length;
        char[] a = new char[size];

//        for (int i = 0; i < size; i++) {
//            a[(size-1) - i] = charString[i];
//        }

        //while loop
        int i = 0;
        while (i < size) {
            a[size-1-i] = charString[i];
            i++;
        }
        System.out.println(a);
    }
}
