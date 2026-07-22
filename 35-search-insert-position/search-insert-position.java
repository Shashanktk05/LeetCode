class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int ls = nums.length - 1;

        while (st <= ls) {
            int mid = st + (ls - st) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                ls = mid - 1;
            }
        }

        return st;
    }
}