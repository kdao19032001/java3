import java.util.TreeSet;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(5);
        treeSetInteger.add(9);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        System.out.println("Các phần tử của treeSetInteger là: ");
        for (int number : treeSetInteger) {
            System.out.print(number + "\t");
        }
    }
}
