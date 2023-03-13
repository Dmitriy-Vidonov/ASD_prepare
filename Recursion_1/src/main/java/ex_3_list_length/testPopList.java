package ex_3_list_length;

public class testPopList {
    public static void main(String[] args) {
        popList list1 = new popList();
        for(int i=0; i<90; i++)
            list1.add(i);

        lenListCalc calc = new lenListCalc();
        System.out.println("len = " + calc.getLength(list1));
    }
}
