class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] sol = new int[encoded.length+1];
        sol[0] = first;
        for(int i= 0; i<encoded.length; i++) {
            sol[i+1] = first^encoded[i];
            first = sol[i+1];
        }
        return sol;
    }
}
