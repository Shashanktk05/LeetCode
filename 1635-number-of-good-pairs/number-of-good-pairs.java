class Solution {
    public int numIdenticalPairs(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i < j) {
                    n++;
                }
            }

        }
        return n;
    }
}