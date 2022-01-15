class Solution {
    public int pairSum(ListNode head) {
        ListNode s = head, e = head;
        Stack<ListNode> st = new Stack<>();
        while(e != null) {
            st.push(e);
            e = e.next;
        }
        int n = st.size()/2;
        int maxSum = 0;
        while(n-->0) {
            int f = s.val, l = (st.pop()).val;
            s = s.next;
            int sum = f + l;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
