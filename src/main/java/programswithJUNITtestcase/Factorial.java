package programswithJUNITtestcase;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
    }

    //It will place values in stack and after getting base condition, it will replace the calculated value so will take more time
    public int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
        return factorialUsingAccumulator(1, n);
    }


    //It will return accumulator directly, we don't need to replace values
    private int factorialUsingAccumulator(int accumulator, int n) {
        if (n == 1) {
            return accumulator;
        }
        return factorialUsingAccumulator(accumulator * n, n - 1);
    }

    //calculate using accumulator

}
