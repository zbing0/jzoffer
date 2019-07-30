public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int total1=1;
        int total=1;
        for(int i=3;i<=n;i++){
            int b=total;
            total = total+total1;
            total1=b;
        }
        return total;
    }
}




public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}