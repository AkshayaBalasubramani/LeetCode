class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=-1,c=0;
        for(int i=0;i<accounts.length;i++){
            int a=0;
            for(int j=0;j<accounts[i].length;j++){
                a=a+accounts[i][j];
            }
            if(a>max){
                c=1;
                max=a;
            }
        }
        return max;
        
    }
}