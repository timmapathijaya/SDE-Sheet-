class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr); // NlogN
        Arrays.sort(dep); // NlogN
        
        int platformRequired = 0;
        int currentPlatformRequired = 0;
        int i = 0 , j = 0;
        while(i < arr.length && j < dep.length) // 2N 
        {
            if(arr[i] <= dep[j])
            {
              currentPlatformRequired += 1;
              i += 1;
            }
            else
            {
              currentPlatformRequired -= 1;
              j += 1;
            } 
            //Maximum number of platform required at any given instance of time.
            platformRequired = Math.max(platformRequired,currentPlatformRequired);  
            
        }
        
        
        return platformRequired;
    }
    
}
// TC : 2 * NlogN + 2N => O(NlogN)
// SC : O(1)

