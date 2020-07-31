package programswithJUNITtestcase;

//If array items are less than length of array
public class FindDuplicatesInAnArrayInLinearTime {
    /*
     * 1. we can use two for loops , complexity - O(n^2)
     * 2. We can use HashMap but that is not in place
     * 3. We will following approach that is O(n) and in-place*/
    static int[] array = {2, 0, 1, 0, 1};

    public static void main(String args[]) {
        findDuplicates(array);
    }

    static void findDuplicates(int[] array) {
        StringBuilder builder = new StringBuilder();
        builder.append("Duplicates: ");
        for (int i = 0; i < array.length; i++) {
            if (array[Math.abs(array[i])] > 0) {
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
                System.out.println("prce " + array[i]);
            } else {
                builder.append(Math.abs(array[i]) + " ");
                System.out.println("else " + array[i]);
            }
        }
        System.out.println(builder.toString());
    }
}
