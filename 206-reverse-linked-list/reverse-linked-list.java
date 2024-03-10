class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevHead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prevHead;
            prevHead = head;
            head = next;
        }
        return prevHead;
    }
}