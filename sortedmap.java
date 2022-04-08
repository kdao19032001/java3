import java.util.SortedMap;
import java.util.TreeMap;
public class sortedmap {
    public static void main(String[] args) {
        SortedMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("Two", 2);
        numbers.put("One", 1);
        System.out.println("SortedMap: " + numbers);


        System.out.println("First Key: " + numbers.firstKey());

        System.out.println("Last Key: " + numbers.lastKey());

        int value = numbers.remove("One");
        System.out.println("Removed Value: " + value);
    }
}
