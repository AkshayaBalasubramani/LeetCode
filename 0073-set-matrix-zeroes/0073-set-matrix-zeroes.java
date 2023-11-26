class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int col0=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[0][j]==0||matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        if(matrix[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }
    }
}

// //brute-O(n^3)
// for(i=0;i<n;i++)
// {
//     for(j=0;j<m;j++)
//     {
//         if(arr[i][j]==0)
//         {
//             markRow(i)=-1
//             markCol(j)=-1
//         }
//     }
// }
   // for(i=0;i<m;i++)
    // {
    //     for(j=0;j<n;j++)
    //     {
    //         if(arr[i][j]==-1)
    //             arr[i][j]=0;
    //     }
    // }
// //iterate again make-1 as 0;
// markRow(i){
//     for(j=0;j<m;j++){
//         if(arr[i][j]!=0)
//             arr[i][j]=-1;
//     }
// }
// markCol(j){
//     for(j=0;j<n;j++){
//         if(arr[i][j]!=0)
//             arr[i][j]=-1;
//     }
// }


//better sol-O(2*n*m)-takes moe space
// for(i=0->n)
// {
//     for(j=0->m)
//     {
//         if(aarr[i][j]==0)
//         {
//             row[i]=1;
//             col[j]=1;
//         }
//     }
// }
// //convert if row and col marked
// for(i=0->n)
// {
//     for(j=0->m)
//     {
//         if(row[i]||col[j])
//             arr[i][j]=0;
//     }
// }