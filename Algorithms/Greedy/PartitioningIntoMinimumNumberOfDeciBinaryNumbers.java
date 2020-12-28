class Solution {
    public int minPartitions(String n) {
        int sol = 0;
        for (int i = 0; i < n.length(); i++)
            sol = Math.max(sol, n.charAt(i) - '0');
        return sol;
    }
}
