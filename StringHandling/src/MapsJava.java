import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsJava {
    public static void main(String[] args) {
        String x = "ARADHYA";
        char[] y = x.toCharArray();
        int size = y.length;
        Map<Character, Integer>map = new HashMap();

        int i = 0;
        //fill the map
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

        //print the values in the map
        Set<Map.Entry<Character, Integer>> hMap = map.entrySet();

        for (Map.Entry<Character, Integer> data: hMap) {
            System.out.print(data.getKey());
            System.out.println(data.getValue());
        }
    }
}
