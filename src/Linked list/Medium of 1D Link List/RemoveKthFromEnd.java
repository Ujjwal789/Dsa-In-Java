public class RemoveKthFromEnd {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) {
                return null;
            }

            ListNode fast = head;
            ListNode slow = head;

            // Move fast pointer n steps ahead
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            // If fast becomes null, remove head
            if (fast == null) {
                return head.next;
            }

            // Move both pointers
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            // Remove nth node
            slow.next = slow.next.next;

            return head;
        }
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        Solution sol = new Solution();
        int n = 3;

        head = sol.removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(head);
    }
}
