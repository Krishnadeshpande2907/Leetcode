import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head1 = reverseLL(l1);
        ListNode head2 = reverseLL(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(head1 != null || head2 != null){
            int val1 = 0;
            int val2 = 0;
            if(head1 != null)   val1=head1.val;
            if(head2 != null)   val2=head2.val;
            int ans = carry + val1+val2;
            ListNode node = new ListNode(ans%10);
            if(ans>9)   carry = 1;
            else    carry = 0;
            temp.next = node;
            temp = temp.next;
            if(head1 !=null)   head1 = head1.next;
            if(head2 !=null)   head2 = head2.next;
        }
        if(carry == 1){
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }
        return reverseLL(dummy.next);
    }

    private ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}