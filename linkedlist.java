import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();

        linkedList.add('j');
        linkedList.add('a');
        linkedList.add('v');
        linkedList.add('a');
        System.out.println("Các phần tử có trong linkedList là: ");
        for (char node : linkedList) {
            System.out.print(node + "\t");
        }
    }
}