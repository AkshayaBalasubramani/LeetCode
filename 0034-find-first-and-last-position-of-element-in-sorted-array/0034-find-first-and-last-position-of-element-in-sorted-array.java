class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        arr[0]=start;
        arr[1]=end;
        return arr;
    
    }
    static int search(int[] nums,int target,boolean findFirst){
            int ans=-1;
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]==target){
                    ans=mid;
                    if(findFirst){
                        e=mid-1;
                    }
                    else{
                        s=mid+1;
                    }
                }
                else if(target<nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
        }
            return ans;
    }
}
    
//     int first;
//         int last;
//         int start=0;
//         int end=nums.length-1;
//         int[] arr={-1,-1};
        
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(nums[mid]==target)
//             {
//                 arr[0]=mid;
//                 if(mid+1>nums.length-1)
//                 {
//                     int[] arr1={0,0};
//                     return arr1;
//                 }
//                 while(nums[mid+1]==nums[mid]&&nums[mid]==target)
//                 {
//                    arr[1]=mid+1;
//                    mid=mid+1;
//                 }
                
//                 while(nums[mid-1]==nums[mid]&&nums[mid]==target)
//                 {
//                     arr[1]=mid-1;
//                     int t=arr[0];
//                     arr[0]=arr[1];
//                     arr[1]=t;
//                     mid=mid-1;
//                 }
//                 break;
//             }
//             else if(target>nums[mid])
//             {
//                 start=mid+1;
//             }
//             else
//             {
//                 end=mid-1;
//             }
//         }
//         return arr;
//     }