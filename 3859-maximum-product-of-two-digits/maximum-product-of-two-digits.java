class Solution {
    public int maxProduct(int n) {
        int org=n;
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }

        int[]arr = new int [count];
        int i=0;
        while(org!=0){
            int rem = org%10;
            org/=10;
            arr[i++]=rem;
        }

        Arrays.sort(arr);

        return arr[arr.length-1]*arr[arr.length-2];



        
    }
}