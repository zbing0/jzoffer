public class Solution {
    public String replaceSpace(StringBuffer str) {
    	StringBuffer newString = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newString.append("%20");
            }else{
                newString.append(str.charAt(i));
            }
        }
        return newString.toString();
    }
}