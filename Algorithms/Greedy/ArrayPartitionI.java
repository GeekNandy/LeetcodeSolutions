class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sol = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sol += Math.min(nums[i], nums[i + 1]);
        }
        return sol;
    }
}
