class Solution {
    public int tribonacci(int n) {
        if(n > 2) {
            int a = 0, b = 1, c = 1, d = 0;
            while(n-- > 2) {
                d = c + b + a;
                a = b;
                b = c;
                c = d;
            }
            return d;
        }
        else if(n < 2) return n;
        else return 1;
    }
}
