class Solution {
    public int[] countBits(int n) {
        n++;
        int[] sol = new int[n];
        for(int i = 1, e = 1, o; i < n;) {
            o = e;
            e *= 2;
            while(i < n && i < e) {
                sol[i] = sol[i - o] + 1;
                i++;
            }
        }
        return sol;
    }
}
