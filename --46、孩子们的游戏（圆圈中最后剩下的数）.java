
--用数组模拟环
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        int[] child =new int[n];
        int i=-1;
        int count = n;
        int num = 0;
        while(count>0){
            i++;
            if(i==n){
                i=0;
            }
            if(child[i]==1){
                continue;
            }
            num++;
           if(num==m){
               num=0;
               child[i]=1;
               count--;
           }
        }
        return i;
    }
}


--用list模拟环
import java.util.LinkedList;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int num=0;
        while(list.size()>1){
            num=(num+m-1)%list.size();
            list.remove(num);
        }
        return list.size()>0?list.get(0):-1;
    }
}


