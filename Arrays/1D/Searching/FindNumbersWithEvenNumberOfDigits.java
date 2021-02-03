class Solution {
    public int findNumbers(int[] nums) {
        int ctr = 0;
        for(int i: nums) {
            String s = ""+i;
            if(s.length()%2==0) ctr++;
        }
        return ctr;
    }
}
