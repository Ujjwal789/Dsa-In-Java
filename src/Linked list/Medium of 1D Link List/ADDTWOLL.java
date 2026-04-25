public class ADDTWOLL {

    // Definition of singly linked list
    static class ListNode {
        public int data;
        public ListNode next;

        ListNode() { data = 0; next = null; }
        ListNode(int x) { data = x; next = null; }
        ListNode(int x, ListNode next) { data = x; this.next = next; }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int sum = 0;

                if (l1 != null) {
                    sum += l1.data;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.data;
                    l2 = l2.next;
                }

                sum += carry;
                carry = sum / 10;

                ListNode last = new ListNode(sum % 10);
                temp.next = last;
                temp = temp.next;
            }

            return dummy.next;
        }
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // PSVM (main method)
    public static void main(String[] args) {

        // Create first number: 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Create second number: 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result); // Expected: 7 -> 0 -> 8 -> null
    }
}