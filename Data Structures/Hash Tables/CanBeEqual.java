class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0, f = 0; i < target.length; i++) {
            f = m.getOrDefault(target[i], 0);
            m.put(target[i], f + 1);
            f = m.getOrDefault(arr[i], 0);
            m.put(arr[i], f - 1);
        }
        for(int i : m.keySet()) {
            if(m.get(i) != 0) return false;
        }
        return true;
    }
}
