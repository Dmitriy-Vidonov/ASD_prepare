package ex_3_list_length;

import java.util.ArrayList;

public class TestListLen_test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<50; i++)
            list.add(i);

        listLength_test listos = new listLength_test();
        System.out.println("длина = " + listos.getLength(list));
    }
}
