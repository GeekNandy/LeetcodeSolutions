class Solution {
    public String defangIPaddr(String address) {
        char[] arr = address.toCharArray();
        int n = arr.length;
        String sol = "";
        for(int i=0; i<n; i++) {
            sol+=((arr[i]!='.')?(""+arr[i]):"[.]");
        }
        return sol;
    }
}
