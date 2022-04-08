import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ONE");
        hashSet.add("TWO");
        hashSet.add("THREE");
        hashSet.add("FOUR");
        System.out.println("Các phần tử có trong hashSet là: ");
        for (String str : hashSet) {
            System.out.print(str + "\t");
        }
    }
}
