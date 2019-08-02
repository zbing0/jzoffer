import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       int maxNum = sum/2+1;
       ArrayList<ArrayList<Integer>> res = new ArrayList();
       for(int i=1;i<maxNum;i++){
           int total=sum;
           int k=i;
           ArrayList<Integer> tmp = new ArrayList();
           while(total>0){
               total-=k;
               tmp.add(k);
               k++;
           }
           if(total==0){
               res.add(tmp);
           }
       }
        return res;
    }
}