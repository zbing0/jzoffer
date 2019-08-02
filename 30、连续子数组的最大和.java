public class Solution {
    int max = -9999;
    
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length;i++){
            int total = 0;
            for(int j=i;j<array.length;j++){
                total+=array[j];
                if(total>max){
                    max=total;
                }
            }
        }
        return max;
    }
}



public class Solution {
    int max = -9999;
    int g=-9999;
    
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0){
            return 0;
        }
        for(int i=0;i<array.length;i++){
           if(array[i]+g>array[i]){
               g=array[i]+g;
           }else{
               g=array[i];
           }
           max=max>g?max:g;
        }
        return max;
    }
}