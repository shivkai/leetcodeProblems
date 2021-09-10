class Solution {
    public int[] twoSum(int[] nums, int target) { //here is input
       int x = nums.length;
        for(int i=0;i<x;i++)
        {
            for(int j=i+1;j<x;j++)
            {
                if(nums[i]+nums[j]==target) //if sum of array element at index i and j is equal to target
                {
                    return new int[]{i,j};  // when if condition is true then return the arr[i],arr[j]
                }
            }
        }
        return null;
    }
}
