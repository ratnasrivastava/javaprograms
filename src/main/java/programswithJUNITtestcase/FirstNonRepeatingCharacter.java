package programswithJUNITtestcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            String string = reader.readLine();
            char c = firstNonRepeatingCharacter(string, n);
            if (c != '\0') {
                System.out.println((char) c);
            } else {
                System.out.println("-1");
            }
        }
    }

    private static char firstNonRepeatingCharacter(String string, int n) {

        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            linkedHashMap.put(string.charAt(i), linkedHashMap.get(string.charAt(i)) == null ? 1 : linkedHashMap.get(string.charAt(i)) + 1);
        }
        Iterator<Character> iterator = linkedHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            char fnrc = (char) iterator.next();
            if (linkedHashMap.get(fnrc) == 1) {
                System.out.println(fnrc);
                return fnrc;
            }
        }
        return '\0';
    }
}
