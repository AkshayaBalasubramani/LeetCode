class Solution {
     int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
     int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
//     public int search(int[] nums, int target) {
//         int p=pivot(nums);
//         if(nums.length==1){
//             if(nums[0]==target){
//                 return 0;
//             }
//             else{
//                 return -1;
//             }
//         }
//         if(p==-1){
//             return bin(nums,0,nums.length-1,target);
//         }
//         if(target==nums[p]){
//             return p;
//         }
//         else if(target>nums[0]){
//             return bin(nums,0,p-1,target);
//         }
//         else{
//             return bin(nums,p+1,nums.length-1,target);
//         }
//     }
//     int pivot(int[] arr){
//         int s=0;
//         int e=arr.length-1;
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             if(mid<e&&arr[mid]>arr[mid+1])
//                 return mid;
//             if(mid>s&&arr[mid]<arr[mid-1])
//                 return mid-1;
//             if(arr[s]>=arr[mid])
//                 e=mid;
//             else
//                 s=mid+1;
//         }
//         return -1;
//     }
//     int bin(int[] arr,int s,int e,int t){
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             if(arr[mid]>t)
//                 e=mid+1;
//             else if(t>arr[mid])
//                 s=mid+1;
//             else
//                 return mid;
//         }
//         return -1;
//     }
// }