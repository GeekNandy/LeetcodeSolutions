class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, curr = 0;
        for(int i: gain) {
            curr+=i;
            if(curr>max) max = curr;
        }
        return max;
    }
}
