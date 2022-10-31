public class sumOfDigits {

    public static int sumOfDigits(int n) {
        // base case
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);

    }

    public static void main(String[] args) {

        int n = 112;
        int result = sumOfDigits(n);

        System.out.println("The sum of digits " + n + " is : " + result);
    }
}
