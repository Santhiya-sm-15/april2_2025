# april2_2025
The problem that i solved today in leetcode

1.You are given a 0-indexed integer array nums.

Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.

The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].

Code:
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length,i,j,k;
        long res=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    res=Math.max(res,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return res;
    }
}
