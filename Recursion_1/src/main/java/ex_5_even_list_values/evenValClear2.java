package ex_5_even_list_values;
import java.util.ArrayList;

public class evenValClear2 {
    public void isValPrint(ArrayList<Integer> listVal) {
            isValPrintHelper(listVal, 0);
        }
        private void isValPrintHelper(ArrayList<Integer> listVal, int index) {
        if(listVal.isEmpty() || index >= listVal.size())
            return;

        if(listVal.get(index) % 2 == 0)
            System.out.println(listVal.get(index));

        isValPrintHelper(listVal, index + 1);
    }
}
