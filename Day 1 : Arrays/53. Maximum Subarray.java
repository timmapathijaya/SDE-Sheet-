class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm 
        
        int maxSubarraySum = nums[0];
        int sum = 0;
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];
            maxSubarraySum = Math.max(maxSubarraySum , sum);
    // Because carrying a -ve sum is of no use , it would automatically decrease my subarray sum.
            if(sum < 0)
                sum = 0;
        }
        return maxSubarraySum;
    }
}
// TC : O(N)
// SC : O(1)
