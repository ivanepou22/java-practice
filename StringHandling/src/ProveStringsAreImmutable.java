public class ProveStringsAreImmutable {
    public static void main(String[] args) {
        //immutable Strings
        String x = "ABC";
        String y = "TECH";
        x.concat(y);
        System.out.println(x);

        //mutable Strings
        StringBuffer xx = new StringBuffer("ABC");
        StringBuffer yy = new StringBuffer("TECH");
        xx.append(yy);
        System.out.println(xx);

        StringBuilder xxx = new StringBuilder("ABC");
        StringBuilder yyy = new StringBuilder("TECH");
        xxx.append(yyy);
        System.out.println(xxx);
    }
}
