public class factorial {

    public static int factorial(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        System.out.println(n);
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int result = factorial(-2);
        System.out.println(result);

    }
}
