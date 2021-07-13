class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = createPattern(pattern);
        List<String> r = new ArrayList<>();
        for(String w : words) {
            int[] wc = createPattern(w);
            if(Arrays.equals(wc, p)) r.add(w);
        }
        return r;
    }
    
    public int[] createPattern(String w) {
        int n = w.length();
        Map<Character, Integer> m = new HashMap<>();
        int[] r = new int[n];
        for(int i = 0; i < n; i++) {
            char c = w.charAt(i);
            m.putIfAbsent(c, m.size());
            r[i] = m.get(c);
        }
        return r;
    }
}
