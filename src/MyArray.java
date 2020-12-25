import java.util.*;

public class MyArray {

    private int size_1;
    private int size_2;
    transient Object[] elementData_1;
    transient Object[] elementData_2;
    private static final Object[] EMPTY_ELEMENTDATA_1 = {};
    private static final Object[] EMPTY_ELEMENTDATA_2 = {};


    @Override
    public String toString() {
        return "MyArray{" +
                "size = " + size_1 +
                ", Array №1 =" + Arrays.toString(elementData_1) +
                ", size = " + size_2 +
                ", Array №2 =" + Arrays.toString(elementData_2) +
                '}';
    }

    MyArray(Collection<Integer> c1, Collection<Integer> c2) {
        Object[] a = c1.toArray();
        Object[] b = c2.toArray();
        if ((size_1 = a.length) != 0 & (size_2 = b.length) != 0) {
            if ((c1.getClass() == ArrayList.class) || (c2.getClass() == ArrayList.class)) {
                elementData_1 = a;
                elementData_2 = b;
            } else {
                elementData_1 = Arrays.copyOf(a, size_1, Object[].class);
                elementData_2 = Arrays.copyOf(b, size_2, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData_1 = EMPTY_ELEMENTDATA_1;
            elementData_2 = EMPTY_ELEMENTDATA_2;
        }

    }
    
    void findDuplicate() {
        Set<Integer> duplicateValue = new TreeSet<Integer>();

        for (int x = 0; x < elementData_1.length; x++) {
            Object a = elementData_1[x];
            for (int y = 0; y < elementData_2.length; y++) {
                Object b = elementData_2[y];
                if (a == b) duplicateValue.add((Integer) a);
            }
        }

        System.out.println(duplicateValue.toString());

    }


}
