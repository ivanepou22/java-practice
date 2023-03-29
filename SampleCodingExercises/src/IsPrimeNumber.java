public class IsPrimeNumber {

    public static void main(String[] args) {
    countPrimeNumbers();
    }
    public static void countPrimeNumbers(){
        int counter = 0;
        for (int j = 1; j <= 1000; j++){
            if (isPrime(j)){
                counter++;
                System.out.println(j + " is a prime number");
            }
            if (counter == 3)
                break;
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
