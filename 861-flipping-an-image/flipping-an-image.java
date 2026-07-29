class Solution {

    public int[][] flipAndInvertImage(int[][] arr) {

        for (int k = 0; k < arr.length; k++) {
            int i = 0;
            int j = arr[0].length - 1;
            while (i < j) {
                int temp = arr[k][j];
                arr[k][j] = arr[k][i];
                arr[k][i] = temp;
                i++;
                j--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                }
            }

        }
        return arr;
    }
}
