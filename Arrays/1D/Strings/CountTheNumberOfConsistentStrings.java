class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) set.add(allowed.charAt(i));
        for(int i = 0; i < words.length; i++) {
            boolean ok = true;
            for(char ch : words[i].toCharArray()) {
                if(!set.contains(ch)) {
                    ok = false;
                    break;
                }
            }
            if(ok) c++;
        }
        return c;
    }
}
