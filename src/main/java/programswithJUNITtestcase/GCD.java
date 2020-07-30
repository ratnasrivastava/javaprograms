package programswithJUNITtestcase;

public class GCD {
    public static void main(String args[]) {
        System.out.println(gcdIterative(3, 11));
        System.out.println(gcdRecursive(2, 6));
    }

    public static int gcdIterative(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int gcdRecursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcdRecursive(num2, num1 % num2);
    }
}
