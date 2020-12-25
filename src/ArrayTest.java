import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(8);
        list1.add(15);
        list1.add(2);
        list1.add(85);
        list1.add(22);
        list1.add(31);
        list1.add(9);
        list1.add(6);
        list1.add(36);
        list1.add(47);

        list2.add(84);
        list2.add(51);
        list2.add(4);
        list2.add(13);
        list2.add(85);
        list2.add(31);
        list2.add(8);
        list2.add(2);
        list2.add(1);
        list2.add(22);
        list2.add(47);
        list2.add(36);

        MyArray first_array = new MyArray(list1, list2);

        System.out.println(first_array);

        first_array.findDuplicate();

    }

}
