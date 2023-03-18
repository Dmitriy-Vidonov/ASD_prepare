package ex_7_second_max_element;
import java.util.List;

class SecondMax {
    public static int findSecondMax(List<Integer> list) {
        return findSecondMaxHelper(list, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    private static int findSecondMaxHelper(List<Integer> list, int max, int secondMax) {
        if(list.isEmpty()) return secondMax;

        int current = list.get(0);
        if(current > max) {
            secondMax = max;
            max = current;
        }
        else if(current > secondMax && current < max)
            secondMax = current;

        return findSecondMaxHelper(list.subList(1, list.size()), max, secondMax);
    }
}
