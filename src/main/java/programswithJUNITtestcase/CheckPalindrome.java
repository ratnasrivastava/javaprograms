package programswithJUNITtestcase;

public class CheckPalindrome {
    public static void main(String args[]) {
        System.out.println("palindrome? " + checkPalindrome("16761"));
    }

    public static boolean checkPalindrome(String s) {
        if (s.length() == 0)
            return true;
        int i = 0, j = s.length() - 1, mid = (i + j) / 2;
        for (; i <= mid; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
