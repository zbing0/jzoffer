import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        if(len==0){
            return 0;
        }
        
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i=0;i<len;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]);
                val++;
                map.put(array[i],val);
            }else{
                map.put(array[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>len/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}