class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length -1;
        int mid=0;

        while(low<=high){
        	
        	
             mid = (low + high )/2;
            System.out.println(mid);
            
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                high = mid-1;
                }

                else{
                    low = mid+1;

                }

        }
        if(mid == high)
		 return mid +1 ;
        else
        	return mid;
                    
        

        
    }
}