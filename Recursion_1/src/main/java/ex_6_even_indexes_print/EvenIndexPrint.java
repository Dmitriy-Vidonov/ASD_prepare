package ex_6_even_indexes_print;
import java.util.ArrayList;

public class EvenIndexPrint {
    public void EvenPrint(ArrayList<Integer> workList) {
        EvenPrintHelper(workList, 0);
    }
    private void EvenPrintHelper(ArrayList<Integer> workList, int index) {
        if(workList.isEmpty() || index >= workList.size()) return;

        if((index % 2 == 0)){
            System.out.println(workList.get(index));
        }
        EvenPrintHelper(workList, index + 2);
    }
}
