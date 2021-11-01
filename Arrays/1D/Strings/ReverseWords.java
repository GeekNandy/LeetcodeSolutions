class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sol = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sol.append(sb.reverse());
            sol.append(" ");
        }
        sol.deleteCharAt(s.length());
        return new String(sol);
    }
}
