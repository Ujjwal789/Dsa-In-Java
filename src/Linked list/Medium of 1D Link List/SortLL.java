public class SortLL {
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
    }public static void main(String[] args) {
            // Create linked list: 4 -> 2 -> 1 -> 3
            ListNode head = new ListNode(4,
                    new ListNode(2,
                            new ListNode(1,
                                    new ListNode(3))));

            System.out.print("Original list: ");
            printList(head);

            head = sortList(head);

            System.out.print("Sorted list: ");
            printList(head);
        }

        public static ListNode sortList(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode mid = findMiddle(head);
            ListNode rightHead = mid.next;
            mid.next = null;

            ListNode left = sortList(head);
            ListNode right = sortList(rightHead);

            return merge(left, right);
        }

        private  static ListNode findMiddle(ListNode head) {
            ListNode fast = head.next;
            ListNode slow = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        private  static ListNode merge(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tail.next = l1;
                    l1 = l1.next;
                } else {
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }

            if (l1 != null) tail.next = l1;
            if (l2 != null) tail.next = l2;

            return dummy.next;
        }

        // Helper function to print list
        public static void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

}
