class Solution {
    public int pivot(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > st && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[st] <= nums[mid]) {
                st = mid + 1;
            } else if (nums[st] > nums[mid]) {
                end = mid - 1;
            }

        }
        return -1;
    }

    public int binarysearch(int[] nums, int target, int st, int end) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if (pivot == -1) {
            return binarysearch(nums, target, 0, (nums.length - 1));
        }
        if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] <= target) {
            return binarysearch(nums, target, 0, pivot - 1);
        } else {
            return binarysearch(nums, target, pivot + 1, (nums.length - 1));
        }
    }
}