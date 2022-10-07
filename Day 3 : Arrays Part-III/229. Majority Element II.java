class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Boyer's Moore Voting Algorithm 
        // At max we can have 2 majority elements 
        // Making triplets of Distinct elements 
        int n = nums.length;
        
        int majorityElement_1 = nums[0];
        int majorityElement_2 = nums[0];
        int freq_1 = 1 , freq_2 = 0;
        
        for(int i = 1 ; i < n ; i++) // N
        {
            if(nums[i] == majorityElement_1)
                freq_1 += 1;
            else if(nums[i] == majorityElement_2)
                freq_2 += 1;
            else 
            {
                if(freq_1 == 0)
                {
                    majorityElement_1 = nums[i];
                    freq_1 = 1;
                }
                else if(freq_2 == 0)
                {
                    majorityElement_2 = nums[i];
                    freq_2 = 1;
                }
                else
                {
                    freq_1 -= 1;
                    freq_2 -= 1;
                }
            }
        }
        freq_1 = 0;
        freq_2 = 0;
        
        for(int i = 0 ; i < n ; i++) // N
        {
            if(nums[i] == majorityElement_1)
                freq_1 += 1;
            else if(nums[i] == majorityElement_2)
                freq_2 += 1;
        }
        
        List<Integer> majorityElements = new ArrayList<>();
        
        if(freq_1 > n / 3)
            majorityElements.add(majorityElement_1);
        
        if(freq_2 > n / 3)
            majorityElements.add(majorityElement_2);
        
        return majorityElements;
    }
}
// TC : N + N => O(2N)
// SC : O(1)
