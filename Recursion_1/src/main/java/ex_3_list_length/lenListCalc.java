package ex_3_list_length;

public class lenListCalc {
        public int getLength(popList list) {
            if(!list.pop())
                return 0;
            return 1 + getLength(list);
        }
}

