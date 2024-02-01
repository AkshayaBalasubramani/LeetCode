/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
//brute is linear search
//best way is binary search solution
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int e=get_peak(mountainArr);
        //int t=4;
        int l=mountainArr.length()-1;
        int a=binSearch(mountainArr,0,e,target);
        int b=binSearchD(mountainArr,e,l,target);
        if(a!=-1){
            return a;
        }
        else if(b!=-1){
            return b;
        }
        else{
            return -1;
        }
    }
    static int get_peak(MountainArray arr){
        int s=0;
        int e=arr.length()-1;
        while(s!=e){
            int mid=s+(e-s)/2;
            if(arr.get(mid+1)>arr.get(mid)) {
                //ascending part of the array
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return e;
    }
    static int binSearch(MountainArray arr,int s,int e,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(target>arr.get(mid)) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
    static int binSearchD(MountainArray arr,int s,int e,int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(target<arr.get(mid)) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }
}