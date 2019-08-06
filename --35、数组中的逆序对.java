public class Solution {
    int cnt=0;
    public int InversePairs(int [] array) {
        int m = array.length;
        if(m==0){
            return 0;
        }
        findInverse(array,0,m-1);
        return cnt;
    }
    
    public void findInverse(int[] a, int start,int end){
        if(start>=end){
            return;
        }
        int mid=(end-start)/2+start;
        findInverse(a,start,mid);
        findInverse(a,mid+1,end);
        fv(a,start,end);
    }
    
    void fv(int a[],int start,int end){
        int mid=(end-start)/2+start;
        int len=end-start+1;
        int[] tmp = new int[len];
        
        int left = start;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=end){
            if(a[left]<=a[right]){
                tmp[i++]=a[left++];
            }else{
                tmp[i++]=a[right++];
                cnt=(cnt+mid-left+1)%1000000007;
            }
        }
        while(left<=mid){
            tmp[i++]=a[left++];
        }
        while(right<=end){
            tmp[i++]=a[right++];
        }
        for(int k=0;k<len;k++){
            a[start+k]=tmp[k];
        }
    }
}