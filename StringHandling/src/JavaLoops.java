public class JavaLoops {
    public static void main(String[] args) {
        int num[] = {1,7,9,4,5,1,3};
        System.out.println(useDoWhileLoop(num));
    }

    public static int useForLoop(int num[]) {
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }
        return sum;
    }

    public static int useWhileLoop(int num[]){
        int sum = 0;
        int i = 0;
        while (i < num.length){
            sum += num[i];
            i++;
        }

        return sum;
    }

    public static int useDoWhileLoop(int num[]){
        int sum = 0;
        int i = 0;

        do {
            sum += num[i];
            i++;
        }while (i < num.length);

        return sum;
    }
}
