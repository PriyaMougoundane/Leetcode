class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
  int l = letters.length;
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;


        if(letters[end] < target){
            return letters[start];
        }
        

        while (start <= end){
            mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return letters[start % l];

        
    }
}