class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        int longestConsecutiveElementsLength = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int value : nums) // n
            set.add(value);
       
        for(int value : nums) // n
        {
            if(!set.contains(value - 1))// this element is only the starting point of the sequence.
            {
               int currentStreak = 1;
           
               while(set.contains(value + 1))
               {
                   currentStreak += 1;
                   value += 1;
               }
               longestConsecutiveElementsLength = Math.max(longestConsecutiveElementsLength , currentStreak); 
            }
                
        }
        return longestConsecutiveElementsLength;
        
    }
}
// TC : N + N + N => O(3N)
// SC : O(N)
