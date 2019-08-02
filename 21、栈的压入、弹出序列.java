import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    Stack<Integer> dataStack = new Stack();
        
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int i=0;
        int j=0;
        int a = pushA.length;
        if(a==0){
            return true;
        }
        dataStack.push(pushA[0]);
        i++;
        while(i<a){
            if(pushA[i]==popA[j]){
                j++;
                i++;
            }else{
                dataStack.push(pushA[i]);
                i++;
            }
        }
        while(!dataStack.empty()){
            if(dataStack.pop()!=popA[j]){
                return false;
            }
            j++;
        }
        return true;
    }
}