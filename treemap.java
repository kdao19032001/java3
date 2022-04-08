import java.util.TreeMap;
public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(0, 6);
        treeMap.put(1, 5);
        treeMap.put(2, 4);
        treeMap.put(3, 3);
        treeMap.put(4, 2);
        treeMap.put(5, 1);

        System.out.println("Các value có trong treeMap là: ");
        for (Integer value : treeMap.values()) {
            System.out.println("Value = " + value);
        }
    }
}
