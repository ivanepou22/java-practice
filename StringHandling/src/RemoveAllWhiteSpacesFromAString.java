public class RemoveAllWhiteSpacesFromAString {
    public static void main(String[] args) {
        String x = "JOIN ABC GET SKILLED    PLACED  OR  TAKE COMPLETE REFUND";
        x = x.replaceAll("\\s","");
        System.out.println(x);
    }
}
