class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int n = (len/2);
        Map<Integer, Integer> freqs = new HashMap<>();
        for(int i = 0; i < len; i++) {
            int f = 1;
            if(freqs.containsKey(nums[i])) {
                f = freqs.get(nums[i]) + 1;
            }
            if(f == n) return nums[i];
            freqs.put(nums[i], f);
        }
        return -1; // placeholder
    }
}
