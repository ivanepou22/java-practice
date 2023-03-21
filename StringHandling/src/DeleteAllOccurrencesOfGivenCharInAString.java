public class DeleteAllOccurrencesOfGivenCharInAString {
    public static void main(String[] args) {
        String x = "SPIDERSLIES";
        x = x.toUpperCase();
        char[] y = x.toCharArray();
        int size = y.length;
        char key = 'S';
        int i = 0;
        StringBuilder result = new StringBuilder("");
        while (i < size){
            if (y[i] != key) {
                result.append(y[i]);
            }
            i++;
        }
        System.out.println(result);
    }
}
