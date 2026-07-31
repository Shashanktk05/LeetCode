class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int org=x;
        int res=0;
        while(x!=0){
            int rem = x%10;
            res=(res*10)+rem;
            x/=10;
        }
        System.out.print(res);
        return org==res;
    }
}