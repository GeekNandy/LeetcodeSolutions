class Solution {
    boolean isPalindrome(String str) {
        int l = str.length();
        int s = 0, e = l - 1;
        while(s < e) {
            if(str.charAt(s) != str.charAt(e)) return false;
            s++; e--;
        }
        return true;
    }
    
    public String firstPalindrome(String[] words) {
        for(String s : words) {
            if(isPalindrome(s)) return s;
        }
        return "";
    }
}
