import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> strs = new ArrayList();
        TreeSet <String> strTree = new TreeSet();
        if(str==null || str.length()==0){
            return strs;
        }
        char [] arr = str.toCharArray();
        getAllStr(arr,strTree,0);
        strs.addAll(strTree);
        return strs;
    }
    
    void getAllStr(char[] arr,TreeSet<String> strTree,int loc){
        if(arr.length==0||loc<0||loc>arr.length-1){
            return;
        }
        if(loc==arr.length-1){
            strTree.add(String.valueOf(arr));
        }
        
        for(int i=loc;i<arr.length;i++){
            swap(arr,i,loc);
            getAllStr(arr,strTree,loc+1);
            swap(arr,i,loc);
        }
        
    }
    
    void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}