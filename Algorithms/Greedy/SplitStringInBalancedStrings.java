class Solution {
    public int balancedStringSplit(String s) {
        int sol = 0;
        char[] arr = s.toCharArray();
        for(int i=0, left=0, right=0; i<arr.length; i++) {
            if(arr[i]!='R') left++;
            else if(arr[i]!='L') right++;
            if(left==right) sol++;
        }
        return sol;
    }
}
