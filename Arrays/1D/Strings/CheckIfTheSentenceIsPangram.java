class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] chars = new int[26];
        char[] arr = sentence.toCharArray();
        for(char c: arr) chars[c - 97]++;
        for(int i: chars) if(i<1) return false;
        return true;
    }
}
