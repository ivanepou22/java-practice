public class StringContainsOnlyIntegers {
    public static void main(String[] args) {
        String word  = "123456789A";
        System.out.println(containsOnlyIntegers(word));
    }
    public static String containsIntegersOnly(String word) {
        char[] charArray = word.toCharArray();
        int size = charArray.length;
        int i = 0;
        while (i < size) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                i++;
            } else {
                return ("Not an Integer String");
            }
        }
        return ("Integer String");
    }

    public static String containsOnlyIntegers(String x){
        int size = x.length();
        int i = 0;
        while (i < size) {
            if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                i++;
            } else {
                return ("Not an Integer String");
            }
        }
        return ("Integer String");
    }
}
