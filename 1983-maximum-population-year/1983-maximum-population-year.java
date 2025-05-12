class Solution {
    public int maximumPopulation(int[][] logs) {

       
		//int[] arr = new int[logs[logs.length -1][logs[0].length -1]];

        int[] arr = new int[2051];
		
        
		int res=0;
		
		for(int[] l: logs) {
			
			 ++arr[l[0]];
			--arr[l[1]];
			 
			 }
			
			
		for (int i = 1950; i < 2050; ++i) {
	        arr[i] += arr[i - 1];
	        //System.out.println(i + " " + arr[i]);
	        res = arr[i] > arr[res] ? i : res;
	        //System.out.println(arr[i]);
	    }
		
		
		return res;        
    }
}