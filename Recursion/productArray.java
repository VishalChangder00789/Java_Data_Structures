public class productArray {
    public static int prodArr(int a[], int n) {
        if (n <= 0) {
            return 1;
        }
        System.out.println("Value of : " + n);
        System.out.println(a[n - 1]);
        return a[n - 1] * prodArr(a, n - 1);
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int result = prodArr(a, a.length);
        System.out.println(result);
    }
}
