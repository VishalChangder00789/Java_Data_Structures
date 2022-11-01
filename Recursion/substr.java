import javax.swing.plaf.synth.SynthGraphicsUtils;

public class substr {

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        // For this we need to understand that the first character of the string will
        // depend upon the
        // iteration which is running.

        // suppose the string is abcde
        /*
         * 1st iteration str = abcde , substring(1) = bcde and charAt(0) = a
         * 2nd iteration str = bcde , substring(1) = cde and charAt(0) = b
         * 3rd iteration str = cde , substring(1) = de and charAt(0) = c
         * 4th iteration str = de , , substring(1) = e and charAt(0) = d
         * 5th iteration str = e and substring(empty) and charAt(0) = e
         * 6th iteration str = empty , base case running str return ""
         */
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "I am Mindfull";
        String result = reverse(str.substring(1)) + str.charAt(0);
        System.out.println("Reverse of the string : \n" + str + "\n" + " is : \n" + result);
    }
}
