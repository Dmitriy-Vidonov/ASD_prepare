package ex_3_list_length;
import java.util.ArrayList;

public class popList {
    ArrayList<Integer> list;
    popList() {
        list = new ArrayList<>();
    }
    boolean pop() {
        if (list.isEmpty())
            return false;
        else
        {
            list.remove(0);
            return true;
        }
    }
    void add(int N) {
        list.add(N);
    }
}
