import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        
        int k=0;
        int max=-9999;
        ArrayList<Integer> maxNum = new ArrayList();
        if(size==0){
            return maxNum;
        }
        while(k<num.length-size+1){
            for(int i=0;i<size;i++){
                if(max<num[i+k]){
                    max=num[i+k];
                }
            }
            maxNum.add(max);
            max=-9999;
            k++;
        }
        return maxNum;
    }
}