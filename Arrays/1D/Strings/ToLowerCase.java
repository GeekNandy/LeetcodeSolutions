class Solution {
    public String toLowerCase(String str) {
        String res = "";
        for(int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            if(c>64 && c<91) c+=32;
            char ch = (char) c;
            res+=(""+ch);
        }
        return res;
    }
}
