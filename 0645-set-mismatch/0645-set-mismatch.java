class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        int[] ans=new int[2];
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[current]!=nums[i]){
                swap(nums,current,i);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans[0]=nums[index];
                ans[1]=index+1;
            }
        }
        return ans;
    }
    void swap(int[] arr,int s,int l){
        int t=arr[s];
        arr[s]=arr[l];
        arr[l]=t;
    }
}