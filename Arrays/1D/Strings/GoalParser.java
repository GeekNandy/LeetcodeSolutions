class Solution {
    public String interpret(String command) {
        String strNew = command.replace("()","o");
        String strNeww = strNew.replace("(al)","al");
        return strNeww;
    }
}
