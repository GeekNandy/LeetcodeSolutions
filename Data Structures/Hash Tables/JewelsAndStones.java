class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jwls = new HashSet<>();
        char[] arr = jewels.toCharArray();
        for(char ch: arr) {
            jwls.add(ch);
        }
        int ctr=0;
        arr = stones.toCharArray();
        for(char ch: arr) {
            if(jwls.contains(ch)) ctr++;
        }
        return ctr;
    }
}
