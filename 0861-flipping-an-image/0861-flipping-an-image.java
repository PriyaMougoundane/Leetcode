class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int m = image.length;
        int n = image[0].length;

        int[][] res = new int[m][n];

        for(int i =0;i<m;i++){
            int k =0;
            for(int j=n-1;j>=0;j--){

                res[i][k] =  image[i][j];
                
                if(res[i][k] == 0){
                    res[i][k] = 1;
                }else{
                    res[i][k] = 0;
                }
                k++;
                
            }
        }
        return res;
    }
}