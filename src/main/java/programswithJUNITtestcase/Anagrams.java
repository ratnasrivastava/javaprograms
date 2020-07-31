package programswithJUNITtestcase;

import java.util.Arrays;

public class Anagrams {
    public static void main(String args[]) {
        String s1 = "ram";
        String s2 = "amr";
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        System.out.println(s1 + " and " + s2 + " are anagrams: " + isAnagram(array1, array2));
    }

    public static boolean isAnagram(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
