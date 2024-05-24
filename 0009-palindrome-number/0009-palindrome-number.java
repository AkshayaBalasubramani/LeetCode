class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n=0;
        int t=x;
        while(x>0){
            int a=x%10;
            n=n*10+a;
            x=x/10;
        }
        if(n==t){
            return true;
        }
        else{
            return false;
        }
    }
}