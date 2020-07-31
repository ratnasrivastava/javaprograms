package programswithJUNITtestcase;

public class TwoEggProblem {
    static int numOfEggs = 2, numOfFloors = 2;
    private static int[][] dpTable = new int[numOfEggs + 1][numOfFloors + 1];

    public static void main(String args[]) {

        System.out.println(maxDrop(numOfEggs, numOfFloors));
    }

    public static int maxDrop(int numOfEggs, int numOfFloors) {
        dpTable[0][0] = 1;
        dpTable[1][0] = 1;
        //If we have only 1 egg
        for (int i = 0; i <= numOfFloors; i++) {
            dpTable[1][i] = i;
        }

        for (int n = 2; n <= numOfEggs; n++) {
            for (int m = 1; m <= numOfFloors; m++) {
                dpTable[n][m] = Integer.MAX_VALUE;

                //check dropping the egg from 1 to the current floor j
                //if egg gets break so you have n-1 eggs and currentfloor-1
                //if egg doesn't break so u have n eggs and numOfFloors-current floor
                for (int j = 1; j <= m; j++) {
                    int maxDrops = 1 + Math.max(dpTable[n - 1][j - 1], dpTable[n][m - j]);
                    if (maxDrops < dpTable[n][m]) {
                        dpTable[n][m] = maxDrops;
                    }
                }
            }
        }
        for (int i = 0; i <= numOfEggs; i++) {
            for (int j = 0; j <= numOfFloors; j++) {
                System.out.print(dpTable[i][j] + " ");
            }
            System.out.println();
        }
        return dpTable[numOfEggs][numOfFloors];

    }
}
