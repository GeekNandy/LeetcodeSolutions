class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S==null||S.length()==0) return null;
        int n = S.length();
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];
        for(int i=0; i<n; i++) map[S.charAt(i) - 'a'] = i;
        int last = 0, start = 0;
        for(int i=0; i<n; i++) {
            last = Math.max(last, map[S.charAt(i) - 'a']);
            if(last == i) {
                list.add(last-start+1);
                start = last+1;
            }
        }
        return list;
    }
}
