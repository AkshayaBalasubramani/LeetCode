class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            
            if(nums[i]!=i+1){
                int c=nums[i]-1;
                if(nums[i]!=nums[c]){
                swap(nums,c,i);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    void swap(int[] arr,int s,int l){
        int t=arr[s];
        arr[s]=arr[l];
        arr[l]=t;
    }
}