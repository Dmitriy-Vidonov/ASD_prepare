package ex_2_sum_of_digits;

class digitSum {
    int sum(int N) {
        if(N < 10)
            return N;
        int lastDigit = N % 10;
        int numWithoutLastDigit = N / 10;
        return lastDigit + sum(numWithoutLastDigit);
    }
}
