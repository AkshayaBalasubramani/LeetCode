class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> list=new ArrayList<>(10);
        int i=0;
        while(i<nums.length){
            int current=nums[i]-1;
            if(nums[i]!=nums[current]){
                swap(nums,i,current);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                list.add(nums[index]);
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
    