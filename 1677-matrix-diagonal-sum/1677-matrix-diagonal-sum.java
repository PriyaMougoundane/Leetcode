class Solution {
    public int diagonalSum(int[][] mat) {

         int n = mat.length;
	        int res =0;int i=0;

	        for(i=0;i<n;i++){

	            res += mat[i][i];
	            //System.out.println(mat[i][i]);
	            //System.out.println("res:" + res);
	            res += mat[i][n-i-1];
	            //System.out.println(mat[i][n-i-1]);
	            //System.out.println("res:" + res);
	           
	            
	        }
	        if(n%2!=0) {
	        	res -= mat[n/2][n/2];
	        }
        return res;
        
    }
}