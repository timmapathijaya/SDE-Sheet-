class Solution {
    public int findDuplicate(int[] nums) { 
        int n = nums.length;
        
        //  {1 , n - 1}
        int duplicateNumber = 0;
        for(int i = 0 ; i < n ; i++)
        {
            int value = Math.abs(nums[i]);
            if(nums[value] < 0)
            {
                duplicateNumber = value;
                break;
            }   
            else
                nums[value] *= -1;
        }
        
        return duplicateNumber;
    }
}
// TC : O(N)
// SC : O(1)
