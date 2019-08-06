import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> num=new ArrayList();
        if(m==0||n==0){
            return num;
        }
        int circle=(Math.min(m,n)-1)/2+1;
        for(int i=0;i<circle;i++){
            for(int k=i;k<m-i;k++){
                num.add(matrix[i][k]);
            }
            for(int j=i+1;j<n-i;j++){
                num.add(matrix[j][m-i-1]);
            }
            for(int k=m-i-2;k>=i && n-i-1!=i;k--){
                num.add(matrix[n-i-1][k]);
            }
            for(int j=n-i-2;j>i && m-i-1!=i;j--){
                num.add(matrix[j][i]);
            }
        }
        return num;
    }
}