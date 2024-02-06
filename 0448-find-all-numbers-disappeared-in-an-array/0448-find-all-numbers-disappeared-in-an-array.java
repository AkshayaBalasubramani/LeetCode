class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>(10);
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(index+1);
            }
        }
        return list;
    }
    void swap(int[] arr,int s,int l){
        int t=arr[s];
        arr[s]=arr[l];
        arr[l]=t;
    }
}