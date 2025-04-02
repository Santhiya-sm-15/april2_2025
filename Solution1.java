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