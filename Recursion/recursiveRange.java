public class recursiveRange {
    public static int recurseRange(int num) {
        if (num == 0) {
            return 0;
        }

        return num + recurseRange(num - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        int result = recurseRange(num);
        System.out.println(result);
    }
}
