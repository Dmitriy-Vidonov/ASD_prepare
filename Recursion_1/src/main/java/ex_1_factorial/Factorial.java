package ex_1_factorial;

class Factorial {
    int factorial(int N) {
        if(N == 1)
            return 1;
        return N * factorial(N-1);
    }
}
