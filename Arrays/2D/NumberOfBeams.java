class Solution {
    public int numberOfBeams(String[] bank) {
        int b = 0, p = 0;
        for(String s : bank) {
            int c = 0;
            for(int i = 0; i < s.length(); i++) {
                c += (s.charAt(i) - '0');
            }
            if(c > 0) {
                b += (c * p);
                p = c;
            }
        }
        return b;
    }
}
