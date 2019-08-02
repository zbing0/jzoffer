import java.util.Stack;

public class Solution {

    Stack<Integer> dataStack = new Stack();
    Stack<Integer> minStack = new Stack();
    
    public void push(int node) {
        if(dataStack.empty()){
            dataStack.push(node);
            minStack.push(node);
        }else{
            dataStack.push(node);
            int minData= minStack.pop();
            minStack.push(minData);
            minStack.push(minData<node?minData:node);
        }
    }
    
    public void pop() {
        if(dataStack.empty()){
            return;
        }
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        if(dataStack.empty()){
            return -1;
        }
        int data = dataStack.pop();
        dataStack.push(data);
        return data;
    }
    
    public int min() {
        if(minStack.empty()){
            return -1;
        }
        int data = minStack.pop();
        minStack.push(data);
        return data;
    }
}