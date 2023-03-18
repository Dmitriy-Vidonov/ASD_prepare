package ex_7_second_max_element;
import java.util.ArrayList;
import java.util.List;

public class SecondMaxTest2 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(3);
        arrList.add(6);
        arrList.add(10);
        arrList.add(4);
        arrList.add(5);
        arrList.add(2);
        arrList.add(9);

        System.out.println("2-й max = " + SecondMax.findSecondMax(arrList));
        for(int el : arrList) System.out.println(el);
    }
}
