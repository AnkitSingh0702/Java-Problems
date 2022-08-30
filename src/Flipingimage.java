class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
         int [][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0)
                    arr[i][n-j-1]=1;
                else
                    arr[i][n-j-1]=0;
            }
        }
        return arr;
    }
}