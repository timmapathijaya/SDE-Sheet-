class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        List<Integer> row , prev = null;
        
        // In pascal triangle , for every row first & last column value = 1
        
        for(int i = 0 ; i < numRows ; i++) 
        {
            row = new ArrayList<>();
            
            for(int j = 0 ; j < i + 1 ; j++)
            {
                if( j == 0 || j == i )
                    row.add(1);
                else
                    row.add(prev.get(j - 1) + prev.get(j));
            }
            
            pascalTriangle.add(row);
            
            prev = row;
            
        }
        return pascalTriangle;
    }
}
// TC : O(N^2)
// SC : O(N^2)
