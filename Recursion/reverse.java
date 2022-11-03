public class reverse {
    public static String reversee(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reversee((str.substring(1))) + str.charAt(0);
    }

    public static void main(String[] args) {

        String s = "ABCDE";
        String rev = reversee(s);
        System.out.println(rev);
    }
}
