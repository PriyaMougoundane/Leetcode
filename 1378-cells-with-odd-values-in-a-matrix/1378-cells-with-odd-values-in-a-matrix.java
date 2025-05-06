class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         
         int[][] mat = new int[m][n];
         int count=0;
        for(int[] in : indices) {

			for(int j =0;j<n;j++) {
				mat[in[0]][j]++;
			}
			  
			for(int i=0;i<m;i++) {
			  mat[i][in[1]]++;		
			  }
		}
		for(int[] m1 : mat) {
			for(int k =0;k<n;k++) {
				if(m1[k]%2 != 0) {
					count++;
				}
			}
        }
    return count;
        
    }
}
