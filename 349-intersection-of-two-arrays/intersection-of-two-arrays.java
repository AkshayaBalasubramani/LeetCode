class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a =new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(h1.contains(nums2[i])){
                a.add(nums2[i]);
                h1.remove(nums2[i]);
            }
        }
        int[] arr = new int[a.size()];

        // ArrayList to Array Conversion
        for (int i = 0; i < a.size(); i++)
            arr[i] = a.get(i);
        
        return arr;
    }
}