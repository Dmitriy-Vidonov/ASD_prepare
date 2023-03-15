package ex_5_even_list_values;
import java.util.ArrayList;
import java.util.List;

public class evenValTest {
    private int index = 0;

    public void isValPrint(List<Integer> listVal) {
        if (listVal.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        if (listVal.size() == 1 && listVal.get(index) % 2 == 0) {
            System.out.println(listVal.get(index));
            return;
        }
        if (listVal.size() == 1 && listVal.get(index) % 2 != 0)
            return;

        if (listVal.get(index) % 2 == 0 && index < listVal.size() - 1) {
            System.out.println(listVal.get(index));
            index++;
            isValPrint(listVal);
        }
        if (index < listVal.size() - 1) {
            index++;
            isValPrint(listVal);
        }
    }
}








