class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int i=0;i<4;i++) {	
			if(Arrays.deepEquals(mat, target)) {
				return true;
			}else {
				transpose(mat);	
			}
			
		}
		return false;
    }

     private  int[][] transpose(int[][] matrix) {
		// TODO Auto-generated method stub
		
		for(int i =0;i<matrix.length;i++) {
			for(int j=i+1;j<matrix.length;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
				
			}	
	    }

        for(int i =0;i<matrix.length;i++) {
			int l =0;
			int r = matrix.length -1;
			
			while(l<r) {
				int temp = matrix[i][l];
				matrix[i][l]=matrix[i][r];
				matrix[i][r]=temp;
				l++;
				r--;
			}
			
		}
		  return matrix;

     }

	    
    }
