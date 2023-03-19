public class StringLength {
    public static void main(String[] args) {
        String x  = "ABC Tech";
        //length of the string
        //===============solution 1==============
        System.out.println(x.length());

        //=============solution 2===============
        x = x.concat("\0");
        char y[] = x.toCharArray();
        int count = 0;
        int i = 0;

        while (y[i] != '\0')
        {
            ++count;
            ++i;
        }
        System.out.printf("%d",count);
        System.out.println();

        //===============Solution 3==================
        String str = "hello world";
        int count1 = 0;
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch);
            count1++;
        }
        System.out.println(count1);
    }
}
