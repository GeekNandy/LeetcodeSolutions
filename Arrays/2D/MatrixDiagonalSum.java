class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        for(int i=0;i<len/2;i++) sum+=mat[i][len-i-1]+mat[i][i]+mat[len-i-1][i]+mat[len-i-1][len-i-1];
        if(len%2==1) sum+=mat[(len/2)][(len/2)];
        return sum;
    }
}
