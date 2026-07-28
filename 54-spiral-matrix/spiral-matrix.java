class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0;
        int bot=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        int size = (bot+1)*(right+1);
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                arr.add(matrix[i][right]);
            }
            right--;

            if( !(top<=bot && left<=right) ){
                break;
            }
            for(int i=right;i>=left;i--){
                arr.add(matrix[bot][i]);
            }
            bot--;
            for(int i=bot;i>=top;i--){
                arr.add(matrix[i][left]);
            }
            left++;
        }


        return arr;

    }
}