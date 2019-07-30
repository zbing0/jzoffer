public class Solution {
    public boolean Find(int target, int [][] array) {
        int m = array.length;
        int n = array[0].length;
        if(m == 0 || n ==0 || target<array[0][0] || target > array[m-1][n-1]){
            return false;
        }
        int i= m-1;
        int j=0;
        while(j<n && i>=0){
            if(target<array[i][j]){
                i--;
            }else{
                if(target>array[i][j]){
                    j++;
                }else{
                    if(target==array[i][j]){
                    return true;
                    }
                }
            }
        }
        return false;
    }
}