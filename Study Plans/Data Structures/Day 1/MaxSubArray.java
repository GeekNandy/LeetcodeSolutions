class Solution {
    public int maxSubArray(int[] nums) {
        int mx = nums[0], s = 0;
        for(int i = 0; i < nums.length; i++) {
            s += nums[i];
            if(s > mx) mx = s;
            if(s < 0) s = 0;
        }
        return mx;
    }
}
