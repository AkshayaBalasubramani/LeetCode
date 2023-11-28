class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current_val=board[i][j];
                if(current_val!='.')
                {
                    //string as an advantage to separate boxes
                    if(!seen.add(current_val+" found in row "+i)||
                    !seen.add(current_val+" found in column "+j)||
                    !seen.add(current_val+" found in subboxes "+i/3+"-"+j/3))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

//brute
// for(int i=0;i<9;i++)
// {
//     for(int j;j<9;j++)
// }
//fine for 9*9 board but for larger boxes we need to use a better method-hashong