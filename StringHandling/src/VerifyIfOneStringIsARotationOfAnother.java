public class VerifyIfOneStringIsARotationOfAnother {
    public static void main(String[] args) {
        String originalString = "IVAN";
        String keyString = "VANI";

        String newString = originalString.concat(originalString);
        if (newString.contains(keyString)){
            System.out.println("Rotational String");
        } else {
            System.out.println("Not a rotational String");
        }
    }
}
