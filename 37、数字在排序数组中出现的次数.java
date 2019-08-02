public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int cnt=0;
        int i=0;
        for(;i<array.length;i++){
            if(array[i]==k){
                break;
            }
        }
        while(i<array.length && array[i]==k){
            cnt++;
            i++;
        }
        return cnt;
    }
}