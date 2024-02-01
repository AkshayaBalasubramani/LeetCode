class Solution {
    public int findPeakElement(int[] nums) {
        //very similar to find peak element sum
        int s=0;
        int e=nums.length-1;
        while(s!=e){
            int mid=s+(e-s)/2;
            if(nums[mid+1]>nums[mid]) {
                //ascending part of the array
                s=mid+1;
            }
            else {
                //ie,arr[mid+1]<arr[mid]
                //descending part of the array
                e=mid;
            }
        }
        return s;
    }
}