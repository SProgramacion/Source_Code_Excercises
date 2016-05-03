package maraton;

public class Fibonacci {

    public Fibonacci() {
    }

    public int CalcularFibonacci(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return CalcularFibonacci(n - 1) + CalcularFibonacci(n - 2);
        }
    }
}