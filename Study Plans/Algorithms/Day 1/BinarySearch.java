class Solution {
    public int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        while(s <= e) {
            int m = (e - s)/2 + s;
            if(nums[m] > target) {
                e = m - 1;
            }
            else if(nums[m] < target) {
                s = m + 1;
            }
            else return m;
        }
        return -1;
    }
}
