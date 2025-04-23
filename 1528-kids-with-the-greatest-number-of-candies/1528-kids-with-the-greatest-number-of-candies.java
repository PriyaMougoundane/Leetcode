class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> great = new ArrayList<>();
        int max = 0;

        for(int high : candies){
             max = Math.max(max , high);
        }

        for(int i = 0 ;i<candies.length;i++){
            if((candies[i] + extraCandies) >= max){
                great.add(true);
            }else{
                great.add(false);
            }

        }

          return great;


        
    }
}