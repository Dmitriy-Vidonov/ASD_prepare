package ex_2_sum_of_digits;

class digitSum {
    int sum(int N) {
        if(N < 10)
            return N;
        return N % 10 + sum(N / 10);
    }
}
