package programswithJUNITtestcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWithoutReversingWord {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String string = reader.readLine();
            reverseString(string);
        }
    }

    public static void reverseString(String string) {
        //string = i.love.this.programming.very.much
        StringBuilder builder = new StringBuilder();
        int i = string.length() - 1;
        int j = string.length() - 1;
        for (; i > 0; i--) {
            if (string.charAt(i) == '.') {
                builder.append(string.substring(i + 1, j + 1));
                builder.append(".");
                j = i - 1;
            }
        }
        if (i == 0) {
            builder.append(string.substring(i, j + 1));
        }
        System.out.println(builder);
    }

}
