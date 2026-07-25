/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    static int peakIndex(MountainArray mountainArr) {
        int st = 0;
        int end =  mountainArr.length()-1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                st = mid + 1;
            }
        }
        return st;
    }

    static int binarySearch(MountainArray mountainArr, int target, int st, int end ,boolean isAsc) {

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            } 
            if(isAsc){
                 if (mountainArr.get(mid) < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
            }else{
                 if (mountainArr.get(mid) > target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
            }
        }
        return -1;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n =mountainArr.length();

        // for (int i = 0; i < mountainArr.length(); i++) {
        //     arr[i] = mountainArr.get(i);
        // }
        int st = 0;
        int end = peakIndex(mountainArr);

        int ans = binarySearch(mountainArr, target, st, end,true);
        if (ans < 0) {
            ans = binarySearch(mountainArr, target, end, mountainArr.length() - 1,false);
        }
        return ans;
    }

}