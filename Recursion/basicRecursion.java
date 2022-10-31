/**
 * basicRecursion
 */
public class basicRecursion {

    public static void printRecursion(int n) {
        if (n == 1) {
            System.out.println(n);
            return; // return is very much needed for recursion.
        }

        printRecursion(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        printRecursion(7);
    }
}