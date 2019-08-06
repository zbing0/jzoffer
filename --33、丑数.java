import java.util.ArrayList;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<1){
            return 0;
        }
        ArrayList<Integer> num=new ArrayList();
        num.add(1);
        int index2=0,index3=0,index5=0;
        while(num.size()<index){
            int num2=num.get(index2)*2;
            int num3=num.get(index3)*3;
            int num5=num.get(index5)*5;
            int n = Math.min(num2,num3)<num5?Math.min(num2,num3):num5;
            if(n==num2){
                index2++;
            }
            if(n==num3){
                index3++;
            }
            if(n==num5){
                index5++;
            }
            num.add(n);
        }
        return num.get(num.size()-1);
    }
}