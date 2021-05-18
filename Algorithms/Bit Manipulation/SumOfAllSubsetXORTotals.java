class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length, res = 0, max = 1 << n;
        for(int i = 1; i < max; i++) {//generate from 1 to 1 << n
            int xor = 0;
            for(int j = 0; j < n; j++)//loop for n
                if((i & (1 << j)) != 0)//left shift 1 j times, calculate AND. if it's not 0 it means jth bit is set(1) 
                    xor ^= nums[j];
            res += xor;
        }
        return res;
    }
}
