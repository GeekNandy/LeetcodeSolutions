class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int lenW1 = word1.length();
        int lenW2 = word2.length();
        String res = "";
        int lim = -1;
        boolean isWord1Longer = false;
        
        if(lenW1>lenW2) {
            lim = lenW2;
            isWord1Longer = true;
        }
        else lim = lenW1;
        
        for(int i=0; i<lim; i++) res+=(word1.charAt(i)+""+word2.charAt(i));
        
        if(lenW1!=lenW2) res+=(isWord1Longer?(word1.substring(lim)):(word2.substring(lim)));
        
        return res;
    }
}
