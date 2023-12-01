//brute sol is traversing the array and counting for the next greatest element

//for an optimal sol stack feature along with the indices values we make use of the advantage
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack=new Stack<>();
        
        int n=temperatures.length;
        int[] result=new int[n];
        
        for(int idx=n-1;idx>=0;idx--)
        {
            while(!helperStack.isEmpty() && 
                  temperatures[idx]>=temperatures[helperStack.peek()])
             {
                 helperStack.pop();
             }
            if(!helperStack.isEmpty())
            {
                   result[idx]=helperStack.peek()-idx;
            }
            helperStack.push(idx);
       }
       return result;
    }
}