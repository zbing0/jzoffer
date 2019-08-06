public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null || pattern==null){
            return false;
        }
        int si = 0;
        int pi=0;
        return mth(str,pattern,si,pi);
    }
    
    boolean mth(char[] str,char[] pattern , int si,int pi){
        if(si==str.length && pi == pattern.length){
            return true;
        }
        if(si!=str.length && pi==pattern.length){
            return false;
        }
        
        if(pi<pattern.length-1 && pattern[pi+1]=='*'){
            if(si!=str.length && (str[si]==pattern[pi]||pattern[pi]=='.')){
                return mth(str,pattern,si,pi+2) || mth(str,pattern,si+1,pi) || mth(str,pattern,si+1,pi+2);
            }else{
                return mth(str,pattern,si,pi+2);
            }
        }
        
        if(si!=str.length && (str[si]==pattern[pi]||pattern[pi]=='.')){
            return mth(str,pattern,si+1,pi+1);
        }
        return false;
    }
}