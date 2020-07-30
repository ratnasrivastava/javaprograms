package programswithJUNITtestcase;

public class SumOfnNumbersWithRecursion {
    int i = 1;
    int sum = 0;

    public static void main(String args[]) {
        SumOfnNumbersWithRecursion sumOfnNumbersWithRecursion = new SumOfnNumbersWithRecursion();
        int n = 5;
        System.out.println(sumOfnNumbersWithRecursion.getSumOfnNumbersWithRecursion(n));
    }

    public int getSumOfnNumbersWithRecursion(int n) {
        //define base case
        if (n == 1)
            return 1;
        return n + getSumOfnNumbersWithRecursion(n - 1);

    }
}
