class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int num=numbers[i];
            int diff=target-numbers[i];
            if(map.containsKey(diff)){
                return new int[]{
                    map.get(diff)+1,i+1
                };
            }
            map.put(num,i);
        }
        return new int[]{};
    }
}