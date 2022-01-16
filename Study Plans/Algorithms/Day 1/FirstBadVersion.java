/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1, e = n;
        while(s < e) {
            int m = (e - s) / 2 + s;
            if(isBadVersion(m)) e = m;
            else s = m + 1;
        }
        return s;
    }
}
