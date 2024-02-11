class Solution {
    public int[][] transpose(int[][] matrix) {
          int row = matrix.length;
        int col = matrix[0].length;

        // Create a new matrix to store the transposed elements
        int[][] ans = new int[col][row]; // New matrix with dimensions col x row

        // Traverse through the original matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Assign transposed elements to the new matrix
                ans[j][i] = matrix[i][j]; // Transpose by swapping row and column indices
            }
        }
        return ans; // Return the transposed matrix
    }
}