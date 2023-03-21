public class SwapTwoStrings {
    public static void main(String[] args) {
        String x = "XYZ";
        String y = "PL";
        String temp ="";

        temp = x;
        x = y;
        y = temp;

       //swapping without using the 3rd variable
        String str1 = "Hello";
        String str2 = "World";

        // Swapping the strings
        str1 = new StringBuilder(str1).append(str2).toString();
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        // Printing the swapped strings
        System.out.println("str1: " + str1); // Output: World
        System.out.println("str2: " + str2); // Output: Hello

    }
}
