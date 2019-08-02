public class Solution {
    public String ReverseSentence(String str) {
        if(str==null || str.length()==0){
            return str;
        }
        String ss="";
        String[] s = str.split(" ");
        if(s.length==0){
            return str;
        }
        for(int i=s.length-1;i>=0;i--){
            ss+=s[i];
            ss+=" ";
        }
        return ss.substring(0,ss.length()-1);
    }
}