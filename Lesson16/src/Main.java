import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntArrayList();
        list.add(32);
        list.add(44);
        list.add(55);
        IntList lis2 = new IntArrayList();
        for (int i = 0; i < 10; i++) {
            lis2.add(i);
        }
        list.addAll(lis2);
        System.out.println(list.get(3));
    }
}