public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt=0;
        if(n<=0){
            return cnt;
        }
         
        for(int i=1;i<=n;i*=10){
            int devider = i*10;
            cnt+=(n/devider*i + Math.min(Math.max(0,n%devider-i+1),i));
        }
        return cnt;
    }
}