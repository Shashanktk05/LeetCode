class Solution {
    public int maxProduct(int n) {
        int max =-1;
        int max2=-1;

        while(n!=0){
            int rem = n%10;
            if(max<=rem){
                max2=max;
                max=rem;
            }else if (max2<rem){
                max2=rem;
            }
            n/=10;
        }
        return max*max2;

        // int org=n;
        // int count=0;
        // while(n!=0){
        //     count++;
        //     n/=10;
        // }

        // int[]arr = new int [count];
        // int i=0;
        // while(org!=0){
        //     int rem = org%10;
        //     org/=10;
        //     arr[i++]=rem;
        // }

        // Arrays.sort(arr);

        // return arr[arr.length-1]*arr[arr.length-2];



        
    }
}