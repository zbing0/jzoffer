import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len=input.length;
        ArrayList<Integer> arrays = new ArrayList();
        if(len<k || k==0){
            return arrays;
        }
        int i=0;
        for(;i<len&&i<k;i++){
            arrays.add(input[i]);
        }
        sortArray(arrays);
        for(;i<len;i++){
            if(arrays.get(k-1)>input[i]){
                arrays.set(k-1,input[i]);
                sortArray(arrays);
            }
        }
        return arrays;
    }
    
    void sortArray(ArrayList<Integer> arrays){
        for(int i=0;i<arrays.size();i++){
            for(int j=i+1;j<arrays.size();j++){
                if(arrays.get(i)>arrays.get(j)){
                    int tmp = arrays.get(i);
                    arrays.set(i,arrays.get(j));
                    arrays.set(j,tmp);
                }
            }
        }
    }
}








import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len=input.length;
        ArrayList<Integer> arrays = new ArrayList();
        if(len<k){
            return arrays;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            arrays.add(input[i]);
        }
        return arrays;
    }
    
}