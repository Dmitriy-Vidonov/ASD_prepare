package ex_5_even_list_values;
import java.util.ArrayList;

public class evenValClear {
    private int index = 0;
    public void isValPrint(ArrayList<Integer> listVal) {
        if (listVal.isEmpty() || index >= listVal.size()) {
            return;
        }
        if (listVal.get(index) % 2 == 0) {
            System.out.println(listVal.get(index));
        }
        index++;
        isValPrint(listVal);
    }
}