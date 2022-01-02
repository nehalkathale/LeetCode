/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0, last = n;
        int firstBad = binarySearch(first,last);
        return firstBad;
    }
    
    public int binarySearch(int first, int last){
        if(first <= last){
            int mid = first + (last - first)/2;
            if((!isBadVersion(mid-1) || mid==0) && isBadVersion(mid)) 
                return mid;
            else if(isBadVersion(mid)) //look left
            {
                return binarySearch(first,mid-1);
            }
            else
                return binarySearch(mid+1,last);
        }
        return -1;
    }
}