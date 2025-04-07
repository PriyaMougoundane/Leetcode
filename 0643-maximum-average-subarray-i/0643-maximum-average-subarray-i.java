class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
              int sum = 0;
      
     

        for(int i =0;i<k;i++){
           sum += nums[i];
        }

        int max_sum = sum;

        for (int i=k;i<nums.length;i++){
            sum -= nums[i-k];
            sum += nums[i];
            if (sum >max_sum){
                max_sum = sum;
              

            }

        }

        return (double) max_sum / k;
    }
}