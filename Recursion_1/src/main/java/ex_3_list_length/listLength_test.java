package ex_3_list_length;
import java.util.ArrayList;

class listLength_test {
    public static int getLength(ArrayList<Integer> list) {
        if(list.isEmpty())
            return 0;
        list.remove(0);
        return 1 + getLength(list);
    }
}
