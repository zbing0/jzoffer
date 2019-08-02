//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
import java.util.HashSet;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> numSet = new HashSet();
        
        for(int i=0;i<array.length;i++){
            if(numSet.contains(array[i])){
                numSet.remove(array[i]);
            }else{
                numSet.add(array[i]);
            }
        }
        int [] nums=new int[3];
        int i=0;
        for(int num:numSet){
            nums[i++]=num;
        }
        num1[0]=nums[0];
        num2[0]=nums[1];
    }
}