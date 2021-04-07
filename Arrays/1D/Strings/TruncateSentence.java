class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        if(k<arr.length) {
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<k; i++) sb.append(arr[i]+" ");
            s = sb.toString();
            return s.substring(0, s.length()-1);
        }
        else return s;
    }
}
