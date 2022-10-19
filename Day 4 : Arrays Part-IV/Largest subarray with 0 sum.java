class GfG
{
    int maxLen(int arr[], int n)
    {
        
       int largestSubarrayLength = 0;
       int sum = 0;
       Map<Integer,Integer> map = new HashMap<>(); // {prefixSum , index} 
       
       for(int i = 0 ; i < n ; i++) // n
       {
           sum += arr[i];
           
           if(sum == 0) // 0 to i index is giving as a subarray with sum as 0.
           largestSubarrayLength = i + 1;
           else if(map.containsKey(sum))
           {
              int j = map.get(sum);// at which index previously this sum has occurred.
              largestSubarrayLength = Math.max(largestSubarrayLength , i - j);  
           }
           else
           map.put(sum , i);
       }
       return largestSubarrayLength;
       
    }
}
// TC : O(N)
// SC : O(N)[Map]
