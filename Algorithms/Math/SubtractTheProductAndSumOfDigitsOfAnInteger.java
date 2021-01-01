class Solution {
    public int subtractProductAndSum(int n) {
        int prod=n%10, sum=n%10;
        while(n/10>0) {
            n=n/10;
            prod*=(n%10);
            sum+=(n%10);
        }
        return (prod-sum);
    }
}
