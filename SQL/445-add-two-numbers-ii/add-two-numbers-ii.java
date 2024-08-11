import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l1.val == 0) return l2;
        if (l2 == null || l2.val == 0) return l1;

        BigInteger one = BigInteger.ZERO;
        BigInteger two = BigInteger.ZERO;
        ListNode temp = l1;

        while (temp != null) {   
            one = one.multiply(BigInteger.TEN).add(BigInteger.valueOf(temp.val));
            temp = temp.next;
        }

        temp = l2;
        while (temp != null) {
            two = two.multiply(BigInteger.TEN).add(BigInteger.valueOf(temp.val));
            temp = temp.next;
        }

        BigInteger addition = one.add(two);
        ListNode dum = new ListNode(-1);
        ListNode head1 = dum;

        while (addition.compareTo(BigInteger.ZERO) > 0) {
            BigInteger ans = addition.mod(BigInteger.TEN);
            ListNode node = new ListNode(ans.intValue());
            head1.next = node;
            head1 = head1.next;
            addition = addition.divide(BigInteger.TEN);
        }

        return reverseLL(dum.next);
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