class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // System.out.print(m);
        int [][] arr = new int[m][n];
        for(int i=0;i<n;i++){
             for(int j=0;j<matrix[i].length;j++){
                 arr[j][i]=matrix[i][j];
        }
        }
    return arr;
    }
}