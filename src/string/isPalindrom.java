package string;

public class isPalindrom {
    public static void main(String[] args) {
        System.out.println(check("A man, a plan, a canal: Panama"));
    }
    static boolean check(String str) {
        if (str.length() <= 1) {
            return true;
        }

        str = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (str.charAt(i) != str.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }

}
