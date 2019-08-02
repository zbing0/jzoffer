public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<3){
            return false;
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j] || Math.abs(numbers[i]-numbers[j])>=numbers.length){
                    if(numbers[i]==0 || numbers[j]==0){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}