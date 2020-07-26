package programswithJUNITtestcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum Direction {
    LEFT_RIGHT,
    TOP_DOWN,
    RIGHT_LEFT,
    BOTTOM_TOP
}

public class SpiralArray {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter input, row, col, value");
        try {
            int row = Integer.parseInt(bufferedReader.readLine());
            int col = Integer.parseInt(bufferedReader.readLine());
            int[][] matrix = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }
            int result[] = spiralArray(matrix);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] spiralArray(int[][] matrix) {
        Direction direction = Direction.LEFT_RIGHT;
        int output[] = new int[matrix.length * matrix[0].length];
        int rowindex[] = {0, matrix.length - 1};
        int colIndex[] = {0, matrix[0].length - 1};
        int currIndex = 0;
        while (true) {
            switch (direction) {
                case LEFT_RIGHT:
                    for (int i = rowindex[0], j = colIndex[0]; j <= colIndex[1]; j++) {
                        output[currIndex++] = matrix[i][j];
                    }
                    rowindex[0]++;
                    direction = Direction.TOP_DOWN;
                    break;
                case TOP_DOWN:
                    for(int i=rowindex[0],j=colIndex[1];i<=rowindex[1];i++){
                        output[currIndex++] = matrix[i][j];
                    }
                    colIndex[1]--;
                    direction = Direction.RIGHT_LEFT;
                    break;
                case RIGHT_LEFT:
                    for(int i=rowindex[1],j=colIndex[1];j>=colIndex[0];j--){
                        output[currIndex++] = matrix[i][j];
                    }
                    rowindex[1]--;
                    direction = Direction.BOTTOM_TOP;
                    break;
                case BOTTOM_TOP:
                    for(int i =rowindex[1],j=colIndex[0];i>=rowindex[0];i--){
                        output[currIndex++] = matrix[i][j];
                    }
                    colIndex[0]++;
                    direction = Direction.LEFT_RIGHT;
                    break;
            }
            if(rowindex[1]<rowindex[0]){
                break;
            }
            if(colIndex[1]<colIndex[0]){
                break;
            }
        }
        return output;
    }
}
