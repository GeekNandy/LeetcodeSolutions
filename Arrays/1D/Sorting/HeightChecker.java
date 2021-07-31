class Solution {
    public int heightChecker(int[] h) {
        int n = h.length;
        int s = 0;
        int[] hFreq = new int[101];
        for(int i = 0; i < n; i++) hFreq[h[i]]++;
        for(int i = 0, fIdx = 0; i < n; i++) {
            while(hFreq[fIdx] < 1) fIdx++;
            if(fIdx != h[i]) s++;
            hFreq[fIdx]--;
        }
        return s;
    }
}
