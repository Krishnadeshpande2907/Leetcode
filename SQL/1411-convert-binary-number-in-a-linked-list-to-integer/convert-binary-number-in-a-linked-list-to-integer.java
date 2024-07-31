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
        // StringBuilder ans = new StringBuilder();
        // while(head != null){
        //     ans.append(head.val);
        //     head = head.next;
        // }
        // return Integer.parseInt(ans.toString(), 2);
        int ans = 0;
        while(head!=null){
            ans = ans<<1 | head.val;
            head = head.next;
        }
        return ans;
    }
}