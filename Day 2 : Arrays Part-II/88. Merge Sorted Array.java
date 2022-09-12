class Solution {
    public void swap(int[] nums1 , int[] nums2 , int i , int j)
    {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }
    // 1 3 4 2
    public void insertionSort(int[] nums2)
    {
        for(int i = 1 ; i < nums2.length ; i++)
        {
            int temp = nums2[i];
            int j = i - 1;
            
            while(j >= 0 && nums2[j] > temp)
            {
                nums2[j+1] = nums2[j];
                j--;
            }
            nums2[j+1] = temp;
        }
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Insertion Sort type Approach
        if( n == 0 )
          return;
        
        int i = 0;
        while(i < m) // m 
        {
            if(nums1[i] > nums2[0])
            {
                swap(nums1 , nums2 , i , 0);
                insertionSort(nums2); // n
                
            }
            i += 1;
        }
        
        for(i = m ; i < m + n ; i++)
        {
            nums1[i] = nums2[i - m];
        }
        
    }
}
// TC : m * n + n => O(m * n)
// SC : O(1)
