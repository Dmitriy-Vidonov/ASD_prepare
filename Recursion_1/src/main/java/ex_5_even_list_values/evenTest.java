package ex_5_even_list_values;

import java.util.ArrayList;

public class evenTest {
    public static void main(String[] args) {
        ArrayList<Integer> listEven = new ArrayList<>();
        listEven.add(10);
        listEven.add(5);
        listEven.add(6);
        listEven.add(1);
        listEven.add(7);

        evenValClear3 evenCheck = new evenValClear3();
        evenCheck.printEven(listEven);
    }
}
