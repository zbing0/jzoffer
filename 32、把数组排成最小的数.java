import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        StringBuffer sb=new StringBuffer();
       
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                char[] vi = String.valueOf(numbers[i]).toCharArray();
                char[] vj = String.valueOf(numbers[j]).toCharArray();
                boolean equal=true;
                int k=0;
                for(;k<vi.length && k<vj.length;k++){
                    if(vi[k]<vj[k]){
                        equal=false;
                         break;
                    }
                    if(vi[k]>vj[k]){
                         equal=false;
                         swap(numbers,i,j);
                    }
               }
                if(equal){
                    if(vi.length<vj.length && vj[k-1]>vj[k]){
                        swap(numbers,i,j);
                    }
                }
               
            }
        }
        
        for(int i=0;i<numbers.length;i++){
            sb.append(numbers[i]);
        }
        
        return sb.toString();
    }
    
    void swap(int[] numbers,int i,int j){
        int num = numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=num;
    }
   
}






import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
        int len = numbers.length;
        if(len==0){
            return "";
        }
        ArrayList<Integer> nl = new ArrayList();
        for(int i=0;i<len;i++){
            nl.add(numbers[i]);
        }
        
        Collections.sort(nl,new Comparator<Integer>(){
            public int compare(Integer n1,Integer n2){
                String s1 = n1+""+n2;
                String s2 = n2+""+n1;
                return s1.compareTo(s2);
            }
        });
        
        String s="";
        for(int i=0;i<len;i++){
            s+=nl.get(i);
        }
        return s;
    }
}