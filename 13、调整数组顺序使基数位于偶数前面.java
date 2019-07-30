public class Solution {
    public void reOrderArray(int [] array) {
        for(int i=array.length-1;i>=0;i--){
            if(array[i]%2==0 && i< array.length-1 && array[i+1]%2==1){
                int k = array[i];
                int j=i+1;
                for(;j<array.length;j++){
                    if(array[j]%2==1){
                        array[j-1]=array[j];
                    }else{
                        break;
                    }
                }
                array[j-1]=k;
            }
        }
    }
}