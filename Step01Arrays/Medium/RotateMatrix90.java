package Step01Arrays.Medium;

public class RotateMatrix90 {
    public int[][] rotate(int[][] mat){
        if(mat == null) return mat;

        int n = mat.length;

        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                rotated[j][n - i - 1] = mat[i][j];
            }
        }
        return rotated;

    }
}

class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        RotateMatrix90 obj = new RotateMatrix90();
        int[][] rotated = obj.rotate(mat);

        
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}