class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
          int n = matrix.length;
        int m = matrix[0].length;
        
       List<Integer> max_col = new ArrayList<Integer>();
       List<Integer> min_row = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        
       for(int i = 0;i<n;i++){
           int min = Integer.MAX_VALUE;
            for(int j = 0;j<m;j++ ){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                }
            }
           min_row.add(min);
       }
        
        for(int i = 0;i<m;i++){
           int max = Integer.MIN_VALUE;
            for(int j = 0;j<n;j++ ){
                if(max<matrix[j][i]){
                    max = matrix[j][i];
                }
            }
           max_col.add(max);
       }
        
        for(int i = 0;i<min_row.size();i++){
            if(max_col.contains(min_row.get(i))){
                ans.add(min_row.get(i));
            }
        }
        

        return ans;
    }
}