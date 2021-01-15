class Solution {
    public int maxDepth(String s) {
        int o=0, d=0;
        char[] a = s.toCharArray();
        for(int i=0; i<a.length; i++) {
            if(a[i] == '(') o++;
            else if(a[i] == ')') o--;
            if(o>d) d = o;
        }
        return d;
    }
}
