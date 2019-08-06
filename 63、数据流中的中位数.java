import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList<Integer> nums = new ArrayList();

    public void Insert(Integer num) {
        nums.add(num);
    }

    public Double GetMedian() {
        Collections.sort(nums);
        int length = nums.size();
        if(length%2==0){
            return (nums.get(length/2)+nums.get(length/2-1))/2.0;
        }else{
            return nums.get(length/2)*1.0;
        }
    }


}