import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A.length==0){
            return B;
        }
        for(int i=0;i<A.length;i++){
            int num=A[i];
            A[i]=1;
            B[i]=1;
            for(int j=0;j<A.length;j++){
                B[i]*=A[j];
            }
            A[i]=num;
        }
        return B;
    }
}


import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if(A.length==0){
            return B;
        }
        B[0]=1;
        for(int i=1;i<A.length;i++){
            B[i]=B[i-1]*A[i-1];
        }
        int tmp=1;
        for(int i=A.length-2;i>=0;i--){
            tmp*=A[i+1];
            B[i]*=tmp;
        }
        return B;
    }
}