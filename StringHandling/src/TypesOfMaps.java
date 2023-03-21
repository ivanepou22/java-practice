import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TypesOfMaps {
    public static void main(String[] args) {
        //HashMap
        //LinkedHashMap
        //TreeMap

        Map<Character, Integer> hash = new HashMap<>();
        Map<Character, Integer> linked = new LinkedHashMap<>();
        Map<Character, Integer> tree = new TreeMap<>();

        /***
         * Difference is in the order in which the data is stored
         * HashMap -> Stores data keys in a random order
         * LinkedHashMap -> Stores data keys in the co-related order, the order of the data
         * stored co-relates the order in the input string.(same sequence as the input string)
         * TreeMap -> stores the data keys in ascending order.
         */
    }
}
