class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean col_0 = false;
        
        for(int i = 0 ; i < rows ; i++) // rows * cols 
        {
            if(matrix[i][0] == 0)
                col_0 = true;
            for(int j = 1 ; j < cols ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // Modification : start traversing from back. If we would have started from first it would update our dummy matrix.
        
        for(int i = rows - 1 ; i >= 0 ; i--) // rows * cols
        {
            for(int j = cols - 1 ; j > 0 ; j--)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(col_0)
                matrix[i][0] = 0;
        }
        
    }
}
// TC : rows * cols + rows * cols => O(2 * (rows * cols))
// SC : O(1)
