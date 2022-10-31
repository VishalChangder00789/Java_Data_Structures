import java.rmi.server.ExportException;

public class power {
    public static int power(int base, int exp) {

        if (exp < 0) {
            return -1;
        }

        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exp = 4;

        int result = power(base, exp);
        System.out.println("The ans : " + result);
    }
}
