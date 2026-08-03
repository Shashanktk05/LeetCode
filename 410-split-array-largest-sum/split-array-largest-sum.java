class Solution {
    

    public int splitArray(int[] nums, int k) {

        int st = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            st=Math.max(st,nums[i]);
            end += nums[i];
        }
       while(st<end){
        int mid = st+(end-st)/2;
        int s =0;
        int p=0;

        for(int num:nums){
            if((s+num)>mid){
                s=num;
                p++;
            }else{
                s=s+num;
            }
        }

        if(p<k){
            end=mid;
        }else{
            st=mid+1;
        }
       }

        return st;
    }
}