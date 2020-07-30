package programswithJUNITtestcase;

public class LinearAndBinarySearch {
    static int[] array = {56, 7, 234, 33, 5};

    public static void main(String args[]) {
        int index = linearSearch(5);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Element doesn't present in list");
        }
        index = linearSearch(5);
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Element doesn't present in list");
        }
    }

    //linear search
    public static int linearSearch(int item) {
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                return i;
            }
        }
        return -1;
    }

    //binary search
    public static int binarySearch(int item) {
        return binarySearch(0, array.length - 1, item);
    }

    public static int binarySearch(int startIndex, int endIndex, int item) {
        if (endIndex < startIndex) {
            return -1;
        }
        int midIndex = (startIndex + endIndex) / 2;
        if (item == array[midIndex]) {
            return midIndex;
        } else if (item < array[midIndex]) {
            return binarySearch(startIndex, midIndex - 1, item);
        } else {
            return binarySearch(midIndex + 1, endIndex, item);
        }
    }
}
