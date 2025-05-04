class Solution {
    public int largestAltitude(int[] gain) {
      int[] res = new int[gain.length + 1];
      res[0] = 0;

      for(int i =0;i<gain.length; i++){
        int sum = res[i] + gain[i];
        res[i+1] = sum;
      }

      Arrays.sort(res);

      int max = res[res.length -1];

      return max ;
    }
}