public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(10);
    }

    public static void checkNumber(int num){
        if (num > 0){
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
