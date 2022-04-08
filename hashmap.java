import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        hashMap.put(1, 2);
        hashMap.put(2, 3);
        hashMap.put(3, 4);
        hashMap.put(4, 5);
        hashMap.put(5, 6);

        System.out.println("Các entry có trong hashMap là: ");
        hashMap.forEach((keyInt, valueInt) -> System.out.println(
                "Key = " + keyInt + ", value = " + valueInt));
    }
}
