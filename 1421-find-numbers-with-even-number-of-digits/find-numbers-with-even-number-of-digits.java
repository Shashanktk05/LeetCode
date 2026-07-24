class Solution {
    static boolean isEvenCount(int n){
        int dig=0;
        while(n!=0){
            n/=10;
            dig++;
        }
        return (dig%2)==0;
    }
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i = 0 ; i<nums.length;i++){
            if(isEvenCount(nums[i])){
                count++;
            }
        }
        return count;
    }
}