package programswithJUNITtestcase;

import org.junit.Assert;
import org.junit.Test;

public class SpiralArrayJUnitTest {
    @Test
    public void test3on3() {
        int[][] input1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected[] = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        int actual[] = SpiralArray.spiralArray(input1);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6on5() {
        int[][] input1 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30}
        };

        int expected[] = new int[]{1, 2, 3, 4, 5, 10, 15, 20, 25, 30, 29, 28, 27, 26, 21, 16, 11, 6, 7, 8, 9, 14, 19, 24, 23, 22, 17, 12, 13, 18};
        int actual[] = SpiralArray.spiralArray(input1);
        Assert.assertArrayEquals(expected, actual);
    }
}
