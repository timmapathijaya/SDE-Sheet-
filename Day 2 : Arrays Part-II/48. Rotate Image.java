class Solution {
    public void swap(int[][] matrix , int i , int j)
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void reverse(int[][] matrix ,int row ,  int i , int j)
    {
        while(i < j)
        {
            int temp = matrix[row][i];
            matrix[row][i] = matrix[row][j];
            matrix[row][j] = temp;
            
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        // Transpose (row <=> column) 
        for(int i = 0 ; i < n ; i++) // n^ 2
        {
            for(int j = 0 ; j < i ; j++)
                swap(matrix , i , j);
        }
        
        // Reverse every row 
        for(int i = 0 ; i < n ; i++) // n ^ 2
            reverse(matrix , i , 0 , n - 1); // n
    }
}
// TC : N^2 + N ^ 2 => O(2 * (N^2))
// SC : O(1)
