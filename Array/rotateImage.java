import java.util.Arrays;
public class rotateImage {
static void rotateImage(int matrix[][]){
    int n = matrix.length;
       for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
          for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;

            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
}

    public static void main(String[] args) {
     int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        rotateImage(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    }
