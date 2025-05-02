/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int s = 1;
        int end = n;

        while(s<=end){
            int mid = s + (end-s)/2;

            if(isBadVersion(mid) == false){
                s = mid + 1;
            }else if (isBadVersion(mid) == true) {
                end = mid -1 ;
            }else{
                return mid;
            }
        }
        return s;
    }
}