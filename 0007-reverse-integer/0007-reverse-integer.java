// class Solution {
//     public int reverse(int x) {
//         int t=x;
//         int new_no=0;
//         if(x<0){
//             t=-1*t;
//             while(t>0){
//                 int a=t%10;
//                 new_no=new_no*10+a;
//                 t=t/10;
//             }
//             return -1*new_no;
//         }
//         else{
//             while(t!=0){
//                 int a=t%10;
//                 new_no=new_no*10+a;
//                 t=t/10;
//             }
//             return new_no;
//         }
//     }
// }
class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;
    }
}
