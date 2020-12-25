class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        if("".equals(S) || S==null) return 0;
        st.push(S.charAt(0));
        for(int i=1; i<S.length(); i++) {
            char top = 'A';
            if(!st.isEmpty()) top = st.peek();
            if(top!='A' && "()".equals(""+top+""+S.charAt(i))) {
                st.pop();
            }
            else {
                st.push(S.charAt(i));
            }
        }
        return st.size();
    }
}
