import java.util.HashMap;
public class Solution {
    public int StrToInt(String str) {
        int total=0;
        if(str==null||str.length()==0){
            return total;
        }
        HashMap<Character,Integer> m = new HashMap();
        m.put('0',0);
        m.put('1',1);
        m.put('2',2);
        m.put('3',3);
        m.put('4',4);
        m.put('5',5);
        m.put('6',6);
        m.put('7',7);
        m.put('8',8);
        m.put('9',9);
        char[] ss = str.toCharArray();
        char one = ss[0];
        int i=0;
        boolean isS=false;
        if(one=='+'||one=='-'){
            isS=true;
            i++;
        }
        for(;i<ss.length;i++){
            if(m.containsKey(ss[i])){
                total=total*10+m.get(ss[i]);
            }else{
                return 0;
            }
        }
        if(one=='-'){
            total*=(-1);
        }
        return total;
    }
}




import java.util.HashMap;
public class Solution {
    public int StrToInt(String str) {
        int total=0;
        if(str==null||str.length()==0){
            return total;
        }
        char[] ss = str.toCharArray();
        char one = ss[0];
        int i=0;
        boolean isS=false;
        if(one=='+'||one=='-'){
            isS=true;
            i++;
        }
        for(;i<ss.length;i++){
            if(ss[i]>='0' && ss[i]<='9'){
                total=total*10+ss[i]-'0';
            }else{
                return 0;
            }
        }
        if(one=='-'){
            total*=(-1);
        }
        return total;
    }
}