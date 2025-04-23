class Solution {
    public int maximumWealth(int[][] accounts) {
          //int prev_tot = 0;
        int max = 0;
       
       for(int i =0; i<accounts.length;i++){
    	   int max_tot = 0;
           for(int j =0;j<accounts[i].length;j++){
                 max_tot += accounts[i][j]; 
                System.out.println("Total " + accounts[i][j] + " " +  max_tot);
                
                
           }

            max = Math.max(max, max_tot);
            
       }

       return max;
	

    }
}