package ex_7_second_max_element;
import java.util.ArrayList;
import java.util.Collections;

class secMaxFind {
    int secondMax(ArrayList<Integer> arrList) {
        Collections.sort(arrList, Collections.reverseOrder());
        return arrList.get(1);
        }
}

public class SecondMaxTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(3);
        arrList.add(6);
        arrList.add(10);
        arrList.add(4);
        arrList.add(5);
        arrList.add(2);
        arrList.add(9);

        secMaxFind secOb = new secMaxFind();

        System.out.println("2-й max = " + secOb.secondMax(arrList));
        for(int el : arrList) System.out.println(el);
    }
}
