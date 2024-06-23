class Solution {
    public String clearDigits(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                ans = ans.substring(0, ans.length() - 1);
            } else {
                ans += ch;
            }
        }
        return ans;
    }
}