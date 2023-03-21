public class CountingNumberOfWordsInASentence {
    public static void main(String[] args) {
        String x = "WE ARE PROUD UGANDANS";
        String y[] = x.split(" ");
        int words = y.length;
        System.out.println(words);
    }
}
