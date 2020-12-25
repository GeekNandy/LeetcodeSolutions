class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            char top = 'A';
            if(!st.isEmpty()) top = st.peek();
            if(top!='A' && s.charAt(i) == top) st.pop();
            else st.push(s.charAt(i));
        }
        String res = "";
        for(char ch: st) res = res+(""+ch);
        return res;
    }
}
