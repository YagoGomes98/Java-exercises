import java.util.HashSet;

public class LinkedListDeduplicator {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void removeDuplicates(ListNode head) {
        HashSet<Integer> seen = new HashSet<>();
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (seen.contains(current.val)) {
                prev.next = current.next;
            } else {
                seen.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        removeDuplicates(head);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
