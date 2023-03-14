package ex_1_degree;

class Degree {
    int count=1; // тестовый счетчик количества раз возведения в степень
    int degree(int n, int m) {
        if(m == 1)
            return n * m;
        else if(m == 0)
            return 1;
        count++;
        return n * degree(n, m-1);
    }
}
