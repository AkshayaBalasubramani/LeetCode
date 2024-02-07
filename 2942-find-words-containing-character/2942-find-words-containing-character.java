class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int a=fred(s,x);
            if(a==1){
                list.add(i);
            }
        }
        return list;
    }
    static int fred(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                return 1;
        }
        return 0;
    }
}