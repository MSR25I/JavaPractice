package arraysMatrix;
public class SpiralOrderMatrix {

    public static void main(String[] args) {
        int[][] m = { 
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} 
        };

        System.out.println("Spiral Order of the given matrix:");
        printSpiralOrder(m);
    }

    public static void printSpiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move down

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move left

            // Print bottom row (right to left)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move up
            }

            // Print left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move right
            }
        }
    }
}
