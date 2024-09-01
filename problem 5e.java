public class Problem5e {

    public static void main(String[] args) {
        
        int n = 4;
        
        // Calling the method 
        printPattern(n);
    }

    public static void printPattern(int n) {
        // Calculate the size of the matrix (2n - 1)
        int size = 2 * n - 1;
        
        // Create a 2D array 
        int[][] matrix = new int[size][size];

        // Fill the matrix with the pattern values
        for (int i = 0; i < n; i++) {
            int fillValue = n - i; // Value to fill in the current layer
            for (int j = i; j < size - i; j++) {
                for (int k = i; k < size - i; k++) {
                    matrix[j][k] = fillValue;
                }
            }
        }

        // Print the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
