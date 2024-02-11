//kadane's algo'
class Solution { 
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        int s=nums.length;
        for(int i=0;i<s;i++){
            sum+=nums[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
}