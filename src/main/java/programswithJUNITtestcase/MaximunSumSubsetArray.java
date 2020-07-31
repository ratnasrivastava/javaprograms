package programswithJUNITtestcase;

public class MaximunSumSubsetArray {
    public static void main(String args[]) {
        int[] array = {1, -2, 3, 4, -5, 8};
        System.out.println(maximumSubsetArray(array));
    }

    public static int maximumSubsetArray(int[] array) {

        int current_max_sum = array[0];
        int global_max = array[0];
        for (int i = 1; i < array.length; i++) {
            current_max_sum = Math.max(array[i], current_max_sum + array[i]);
            if (global_max < current_max_sum) {
                global_max = current_max_sum;
            }
        }
        return global_max;
    }
}
