class Solution {
    public int mostWordsFound(String[] sentences) {
        int m = 0;
        for(String s : sentences) {
            int l = (s.split(" ")).length;
            if(l > m) m = l;
        }
        return m;
    }
}
