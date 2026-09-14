package Step01Arrays.Medium;

import java.util.Arrays;

public class Matrix_Zero {

    public int[][] Converter(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // Step 1: Find original zeroes
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: Make rows and columns zero
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (rows[i] || cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {0, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        Matrix_Zero z = new Matrix_Zero();

        matrix = z.Converter(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}