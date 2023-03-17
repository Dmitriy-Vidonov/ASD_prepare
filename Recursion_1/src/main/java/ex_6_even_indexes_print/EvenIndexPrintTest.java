package ex_6_even_indexes_print;

import java.util.ArrayList;

public class EvenIndexPrintTest {
    public static void main(String[] args) {
        ArrayList<Integer> listTest = new ArrayList<>();
        for(int i=0; i<10; i++) {
            listTest.add(i);
        }

        EvenIndexPrint printObj = new EvenIndexPrint();
        printObj.EvenPrint(listTest);

        System.out.println("0 % 2 = " + 0 % 2);
    }
}
