package programswithJUNITtestcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class TwoArraysAreEqualOrNot {
    public static void main(String[] args) throws IOException {
        //code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n1 = Integer.parseInt(reader.readLine());
            //int n2 = Integer.parseInt(reader.readLine());
            String[] stringArray1 = reader.readLine().split(" ");
            // int[] array1 = new int[n1];
            // for(int i=0;i<n1;i++){
            //     array1[i] = Integer.parseInt(stringArray[i]);
            // }

            String[] stringArray2 = reader.readLine().split(" ");
            // int[] array2 = new int[n1];
            // for(int i=0;i<n1;i++){
            //     array2[i] = Integer.parseInt(stringArray[i]);
            // }
            if (checkEqualityofArrays(stringArray1, stringArray2)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    private static boolean checkEqualityofArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], map.get(array1[i]) == null ? 1 : map.get(array1[i]) + 1);
        }
        for (int i = 0; i < array2.length; i++) {
            if (!map.containsKey(array2[i])) {
                return false;
            }
            if (map.get(array2[i]) == 0) {
                return false;
            }
            map.put(array2[i], map.get(array2[i]) - 1);
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            if (map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }

}
