class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> m = new HashMap<>();
        for(int i = 1; i < rings.length(); i += 2) {
            Set<Character> s = null;
            if(m.containsKey(rings.charAt(i) - '0')) {
                s = m.get(rings.charAt(i) - '0');
            }
            else s = new HashSet<>();
            s.add(rings.charAt(i - 1));
            m.put(rings.charAt(i) - '0', s);
        }
        int sol = 0;
        for(int i : m.keySet()) {
            if(m.get(i).size() > 2) sol++;
        }
        return sol;
    }
}
