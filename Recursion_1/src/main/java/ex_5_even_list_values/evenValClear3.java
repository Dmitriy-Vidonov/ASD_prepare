package ex_5_even_list_values;

import java.util.ArrayList;

public class evenValClear3 {
    public void printEven(ArrayList<Integer> list){
        printEvenRecursive(list, 0);
    }

    private void printEvenRecursive(ArrayList<Integer> list, int index) {
        if(index >= list.size()) return;

        int currentValue = list.get(index);
        if(currentValue % 2 == 0) System.out.println(currentValue);

        printEvenRecursive(list, index + 1);
    }
}
