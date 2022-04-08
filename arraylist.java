import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Double> arrListDouble = new ArrayList<>(10);

        arrListDouble.add(8.329d);
        arrListDouble.add(1.02d);
        arrListDouble.add(2.9d);
        arrListDouble.add(20.17d);

        System.out.println("Các phần tử có trong arrListDouble là: ");
        System.out.println(arrListDouble);
    }
}
