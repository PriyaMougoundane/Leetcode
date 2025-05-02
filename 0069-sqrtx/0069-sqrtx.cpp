class Solution {
public:
    int mySqrt(int x) {



          int start = 1;
        int end = x;

        while (start <= end){
            int mid = start + (end - start)/2;
            long  sqrt = (long) mid * mid;

            if(sqrt == x){
                return mid;
            }  else if (sqrt > x){
                end = mid - 1;
            } else{
                start = mid + 1;

            }
        }
         return end;
        
        
    }
};