class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
       
        int l = nums.length;

       for(int i = 0; i< l ;i++){
        for(int j = 0; j< l ; j++){

             if(( nums[i]==nums[j]) && (i<j)){
               count++;
            }

        }
       }

        return count;
    }
}