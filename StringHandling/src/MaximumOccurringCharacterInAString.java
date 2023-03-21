import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccurringCharacterInAString {
    public static void main(String[] args) {
        String x = "SILLY_SPIDERS";
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        while (i < size){
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            }
            else
            {
                int oldValue = map.get(y[i]);
                int newValue = oldValue + 1;
                map.put(y[i], newValue);
            }
            i++;
        }
        int maxKey = 0;
        char maxChar = ' ';
        Set<Map.Entry<Character, Integer>> hMap = map.entrySet();
        for (Map.Entry<Character, Integer> data: hMap) {
            if (data.getValue() > maxKey){
                maxKey = data.getValue();
                maxChar = data.getKey();
            }
        }

        System.out.println(maxChar);
    }
}
