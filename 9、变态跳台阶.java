public class Solution {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}


public class Solution {
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        return (int)Math.pow(2,target-1);
    }
}