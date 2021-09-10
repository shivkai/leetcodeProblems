class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int j=0;
        int[] arr = new int[len];
        for(int i=0;i<nums1.length;i++)                       // firstly  i made new array with size equal to sum of sizes of previous two and i fill the new array with value of 
        {                                                      // previous arrays
            arr[i] = nums1[i];
        }
        for(int i=nums1.length;i<len&&j<nums2.length;i++)     
        {
            arr[i] = nums2[j++];
        }
        Arrays.sort(arr);
         
        if(len%2==0)                                              // now if len is even then return a[mid]+a[mid-1]/2
        {
            int mid = len/2;                                      
           return (arr[mid]+arr[mid-1])/2.0;
        
        }
        int mid = len/2;
        return arr[mid];
    }
}
