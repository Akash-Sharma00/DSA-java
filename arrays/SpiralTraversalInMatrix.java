import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraversalInMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> path = new ArrayList();
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        int dir = 0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = top; i <= right; i++) {
                    path.add(matrix[top][i]);
                }
                dir += 1;
                top++;
            } else if (dir ==1) {
                for (int i = top; i <= bottom; i++){
                    path.add(matrix[i][right]);
                }
                right--;
                dir++;
            } else if (dir ==2) {
                for (int i = right; i >= left; i--){
                    path.add(matrix[bottom][i]);
                }
                bottom--;
                dir++;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    path.add(matrix[i][left]);
                }
                dir++;
                left++;

            }
            else {dir=0;}
        }


        return path;
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        System.out.println(spiralOrder(matrix));
    }

}
