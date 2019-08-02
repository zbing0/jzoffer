import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int len= array.length;
        ArrayList<Integer> num = new ArrayList();
        if(len==0){
            return num;
        }
        int num1=999;
        int num2=999;
        int muti=num1*num2;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(array[i]+array[j]==sum && array[i]*array[j]<muti){
                    num1=array[i];
                    num2=array[j];
                    muti=num1*num2;
                }
            }
            
        }
        if(num1!=999){
        num.add(num1);
        num.add(num2);
        }
        return num;
        
    }
}



import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int len= array.length;
        ArrayList<Integer> num = new ArrayList();
        if(len==0){
            return num;
        }
        int i=0;
        int j=len-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                num.add(array[i]);
                num.add(array[j]);
                break;
            }
            if(array[i]+array[j]<sum){
                i++;
            }
            if(array[i]+array[j]>sum){
                j--;
            }
        }
        return num;
        
    }
}