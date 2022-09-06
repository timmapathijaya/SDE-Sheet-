class Solution {
    public void reverse(int[] nums , int i , int j)
    {
        while(i < j)
        {
            swap(nums , i , j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // To get just the next permutataion , try to do the modification in the smallest place value 
        
        int index_1 = -1; // modification index
        
        for(int i = n - 2 ; i >= 0 ; i--) // n
        {
            if(nums[i] < nums[i + 1])
            {
                index_1 = i;
                break;
            }
        }
        
        if(index_1 != -1)
        {
            for(int j = n - 1 ; j > index_1 ; j--) // n
            {
                if(nums[j] > nums[index_1])
                {
                    swap(nums , index_1 , j);
                    break;
                }
            }
        }
        reverse(nums , index_1 + 1 , n - 1); // n
        
    }
}
// TC : N + N + N = > O(3N)
// SC : O(1)
