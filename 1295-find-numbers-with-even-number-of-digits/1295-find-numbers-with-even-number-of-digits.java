class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int a=0;
            while(temp>0){
                temp=temp/10;
                a++;
            }
            if(a%2==0)
                c++;
        }
        return c;
    }
}