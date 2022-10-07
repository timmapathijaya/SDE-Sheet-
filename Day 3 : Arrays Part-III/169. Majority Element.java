class Solution {
    public int majorityElement(int[] nums) {
        // Boyer's Moore Voting Algorithm 
        // Pairing Distinct Element 
        int majorityElement = nums[0];
        int freq = 1;
        
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] == majorityElement)
                freq += 1;
            else 
            {
                if(freq == 0)
                {
                    majorityElement = nums[i];
                    freq = 1;
                }
                else 
                    freq -= 1;
            }
        }
        return majorityElement;
    }
}
// TC : O(N)
// SC : O(1)
