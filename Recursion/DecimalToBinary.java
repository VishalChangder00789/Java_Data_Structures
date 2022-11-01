import javax.lang.model.element.ModuleElement.DirectiveVisitor;

public class DecimalToBinary {

    public static int decimalBinary(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return n % 2 + 10 * decimalBinary(n / 2);
    }

    public static void main(String[] args) {
        int n = 21;
        int result = decimalBinary(n);
        System.out.println("The Binary form is : " + result);
    }
}
