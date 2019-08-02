public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null || str.length()==0){
            return str;
        }
        
        int len = str.length();
        n=n%len;
        
        return str.substring(n)+str.substring(0,n);
    }
}