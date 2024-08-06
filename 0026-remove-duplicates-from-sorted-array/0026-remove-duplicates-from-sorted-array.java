class Solution {
    public int removeDuplicates(int[] nums) {

             int k =0;
	int value ;
		
		//int[] expectedNums = new int[nums.length];

       for(int i =0; i < nums.length; i++) {
			  value = nums[i];
			if (i< 1) {
				 nums[k] =  value ;
				k++;
			}else if (nums[i-1] != nums[i]){
				
				nums[k] =  value;
				k++;
			}
		}
		
		
        //return Arrays.toString(expectedNums);
        return k;
        
    }
}