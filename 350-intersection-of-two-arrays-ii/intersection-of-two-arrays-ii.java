class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                a.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int arr[]=new int[a.size()];
        for(int i=0;i<a.size();i++){
            arr[i]=a.get(i);
        }
        return arr;
    }
}