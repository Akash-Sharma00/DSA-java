package Problems;

import java.util.Arrays;

public class SpiralMat2 {
    public static int[][] generateMatrix(int n) {
        int[][]matrix = new int[n][n];

        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        int dir = 0;
        int e = 1;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = top; i <= right; i++) {
                    matrix[top][i] = e;
                    e++;
                }
                dir += 1;
                top++;
            } else if (dir ==1) {
                for (int i = top; i <= bottom; i++){
                    matrix[i][right] = e;
                    e++;
                }
                right--;
                dir++;
            } else if (dir ==2) {
                for (int i = right; i >= left; i--){
                    matrix[bottom][i] = e;
                    e++;
                }
                bottom--;
                dir++;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = e;
                    e++;
                }
                dir++;
                left++;

            }
            else {dir=0;}
        }

return matrix;

    }
    public static void main(String[] args) {
        int[][]b = generateMatrix(100);
        for (int i = 0; i<100;i++){
            for (int j = 0; j < 100; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
