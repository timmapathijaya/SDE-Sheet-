class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // n log n
        int n = nums.length;
        
        for(int i = 0 ; i < n - 3 ; i++) // n
        {
            for(int j = i + 1 ; j < n - 2 ; j++) // n
            {
               
                int left = j + 1;
                int right = n - 1;
                
                while(left < right)  // n 
                {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target)
                    {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        
                        ans.add(quad);
                        left++;
                        right--;
                        
                        while(left < right && nums[left] == nums[left - 1])// to jump over they duplicates.
                            left += 1;
                        
                        while(right > left && nums[right] == nums[right + 1])// to jump over they duplicates.
                            right -= 1;
                        
                        
                    }
                    else if(sum < target)
                        left += 1;
                    else 
                        right -= 1;
                }
                
                while(j < n - 2 && nums[j + 1] == nums[j])
                    j+= 1;
                
                
            }
            
            while(i < n - 3 && nums[i + 1] == nums[i])
                i += 1;
        }
        return ans;
    }
}
// TC : O(N^3)
// SC : O(1)
