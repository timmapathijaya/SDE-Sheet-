class Solution {
    public void swap(int[] nums , int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm 
        
        int low = 0 , i = 0 , high = nums.length - 1;
        while(i <= high)
        {
           if(nums[i] == 0)
           {
               swap(nums , i , low);
               low++;
               i++;
           }
           else if(nums[i] == 1)
               i++;
           else if(nums[i] == 2)
           {
               swap(nums , i , high);
               high--;
           }
        }
    }
}
// TC : O(N)
// SC : O(1)
/*

(0 , low - 1) => 0
(low , high) => 1
(high + 1 , nums.length - 1) => 2

*/
