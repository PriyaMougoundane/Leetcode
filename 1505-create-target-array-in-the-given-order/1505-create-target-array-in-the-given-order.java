class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i =0;i<nums.length;i++){
            list.add(index[i] , nums[i]);
        }

        //int []  ans = list.stream().toArray(Integer[] ::new);
        
        int[] ans = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i)
;        }

        return ans;
        
    }
}