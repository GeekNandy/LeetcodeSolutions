class Solution {
    public int countVowelStrings(int n) {
        int[][] sol = new int[n+1][6];
        for(int i = 0; i < 6; i++) sol[0][i] = 1;
        for(int i = 1; i < (n + 1); i++) {
            for(int j = 1; j < 6; j++) {
                sol[i][j] = sol[i - 1][j] + sol[i][j - 1];
            }
        }
        return sol[n][5];
    }
}
