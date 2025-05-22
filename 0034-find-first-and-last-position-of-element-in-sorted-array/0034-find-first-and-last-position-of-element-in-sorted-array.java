class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = firstPos(nums,target);
         ans[1] = lastPos(nums,target);
        return ans;
    }

    public int firstPos(int[] nums, int target){

        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (high+low)/2;

            if(nums[mid]>=target){
                //ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
            if(nums[mid]==target) ans=mid;
            
        }
       return ans;

    }

    public int lastPos(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (high+low)/2;

            if(nums[mid]>target){
               // ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
            if(nums[mid]==target) ans=mid;
        }
       return ans;
        
    }
    
}