/**
 * findMax
 */
public class findMax {

    public static int findMax(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.max(arr[n - 1], findMax(arr, n - 1));
    }

    public static void main(String[] args) {
        int arr[] = { 11, 4, 12, 7 };
        int result = findMax(arr, arr.length);
        System.out.println("Maximum element is : " + result);
    }
}