class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<3){
            return n;
        }else{
            int res=1;
            while(res<=n){
                res=res*2;
            }
            return res;
        }
    }
}