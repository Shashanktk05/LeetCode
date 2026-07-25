class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        int start = binary(nums, target, true);
        int end = binary(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int binary(int[] arr, int target, boolean isStart) {
        int st = 0;
        int end = arr.length - 1;

            int ans=-1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                ans=mid;
                if(isStart){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }
}