import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> cm = new HashMap();
        
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(cm.containsKey(a)){ 
                int val = cm.get(a);
                val++;
                cm.put(a,val);
            }else{
                cm.put(a,1);
            }
        }
        
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(cm.containsKey(a)&&cm.get(a)==1){
                return i;
            }
        }
        
        return -1;
    }
}