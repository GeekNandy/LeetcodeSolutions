/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> st = new Stack<>();
        while(head!=null) {
            st.push(head.val);
            head = head.next;
        }
        int size = st.size(), sol=0;
        for(int i=0; i<size; i++) {
            int e = st.pop();
            sol+=(e*((int)Math.pow(2,i)));
        }
        return sol;
    }
}
