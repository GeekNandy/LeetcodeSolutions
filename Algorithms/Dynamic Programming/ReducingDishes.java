class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int len = satisfaction.length - 1, sol = 0, sum = 0;
        for(int i = len; i > -1 && satisfaction[i] > -sum; i--) {
            sum += satisfaction[i];
            sol += sum;
        }
        return sol;
    }
}
