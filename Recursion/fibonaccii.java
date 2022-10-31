public class fibonaccii {

    public static int fib(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        int result = fib(12);
        System.out.println(result);
    }
}
