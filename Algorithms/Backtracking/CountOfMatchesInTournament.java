class Solution {
    public int numberOfMatches(int n) {
        int f = 0;
        while(n>1) {
            f += (n/2);
            n = (int) Math.ceil(n/2.0);
        }
        return f;
    }
}
