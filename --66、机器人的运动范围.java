public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][]flag=new int[rows][cols];
        return getMove(0,0,threshold,rows,cols,flag);
    }
    
    int getMove(int r,int c,int threshold,int rows,int cols,int[][] flag){
        if(r>rows-1||c>cols-1||r<0||c<0|| flag[r][c]==1||getTotal(r)+getTotal(c)>threshold ){
            return 0;
        }
        flag[r][c]=1;
        return getMove(r,c-1,threshold,rows,cols,flag)+
               getMove(r,c+1,threshold,rows,cols,flag)+
               getMove(r-1,c,threshold,rows,cols,flag)+
               getMove(r+1,c,threshold,rows,cols,flag)+1;
    }
    
    
    int getTotal(int num){
        int total=0;
        while(num>0){
            total+=num%10;
            num=num/10;
        }
        return total;
    }
}