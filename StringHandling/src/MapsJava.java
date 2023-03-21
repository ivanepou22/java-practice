import java.util.HashMap;
import java.util.Map;

public class MapsJava {
    public static void main(String[] args) {
        String x = "ARADHYA";
        char[] y = x.toCharArray();
        int size = y.length;
        Map<Character, Integer>map = new HashMap();

        int i = 0;

        while (i < size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldVal = map.get(y[i]);
                int newVal = oldVal + 1;
                map.put(y[i], newVal);
            }

            i++;
        }

        System.out.println(map);
    }
}
