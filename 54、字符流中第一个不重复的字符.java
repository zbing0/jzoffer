import java.util.HashSet;
import java.util.ArrayList;
public class Solution {
    char firstChar='#';
    HashSet<Character> chars = new HashSet();
    ArrayList<Character> list = new ArrayList();
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(!chars.contains(ch)){
            chars.add(ch);
            list.add(ch);
            firstChar=list.get(0);
        }else{
            list.remove((Character)ch);
            if(firstChar==ch){
                if(list.size()>0){
                    firstChar=list.get(0);
                }else{
                    firstChar='#';
                }
            }
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return firstChar;
    }
}