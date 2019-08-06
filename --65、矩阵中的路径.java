public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean[][] flag = new boolean[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(containPath(matrix,i,j,rows,cols,str,0,flag)){
                     return true;
                }
            }
        }
        return false;
    }

    boolean containPath(char[] matrix,int r,int c,int rows,int cols,char[] str,int k,boolean[][] flag){
        if(r<0 || c<0 || r>=rows||c>=cols || flag[r][c]==true || matrix[r*cols+c]!=str[k]){
            return false;
        }
        if( k==str.length-1){
            return true;
        }
        flag[r][c]=true;
        boolean contain = containPath(matrix,r,c+1,rows,cols,str,k+1,flag) ||
                          containPath(matrix,r,c-1,rows,cols,str,k+1,flag) ||
                          containPath(matrix,r+1,c,rows,cols,str,k+1,flag) ||
                          containPath(matrix,r-1,c,rows,cols,str,k+1,flag);
        if(contain){
            return true;
        }
        flag[r][c]=false;
        return false;
    }
}