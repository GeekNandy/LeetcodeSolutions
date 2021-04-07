class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] r = new int[k];
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for(int[] l: logs) {
            m.putIfAbsent(l[0], new HashSet<>());
            m.get(l[0]).add(l[1]);
        }
        for(int i: m.keySet()) r[m.get(i).size()-1]++;
        return r;
    }
}
