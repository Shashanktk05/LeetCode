class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int MOD = 12345;
        int n = grid.length, m = grid[0].length;
        int total = n * m;
        int[] nums = new int[total];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[k++] = grid[i][j] % MOD;
            }
        }
        int[] res = new int[total];
        int prefix = 1;
        for (int i = 0; i < total; i++) {
            res[i] = prefix;
            prefix = (prefix * nums[i]) % MOD;
        }
        int suffix = 1;
        for (int i = total - 1; i >= 0; i--) {
            res[i] = (res[i] * suffix) % MOD;
            suffix = (suffix * nums[i]) % MOD;
        }
        int[][] answer = new int[n][m];
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = res[k++];
            }
        }

        return answer;
    }
}