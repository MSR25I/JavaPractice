package arraysMatrix;
public class SymmetricOfMatrix { 

    public static void main(String[] args) {
        
        int[][] m = { 
                {1, 2, 3},
                {2, 5, 6},
                {3, 6, 9} 
        };

        int n = m.length;
        int[][] transpose = new int[n][n];

        // Compute Transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = m[i][j];
            }
        }

        // Print Transpose Matrix
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Check Symmetric
        if (isSymmetric(m, transpose)) {
            System.out.println("The given matrix is symmetric.");
        } else {
            System.out.println("The given matrix is not symmetric.");
        }
    }

    public static boolean isSymmetric(int[][] original, int[][] transpose) {
        int n = original.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (original[i][j] != transpose[i][j]) {
                    return false; // Not symmetric
                }
            }
        }
        return true; // Symmetric
    }
}
