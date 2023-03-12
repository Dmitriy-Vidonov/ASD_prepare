package ex_1_degree;

class Degree {
    int degree(int n, int m) {
        if(m == 1)
            return n * m;
        return n * degree(n, m-1);
    }
}
