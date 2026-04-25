public class AddOneLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }

    static class Solution {
        public int helper(ListNode temp) {
            if (temp == null) {
                return 1;
            }
            int carry = helper(temp.next);
            temp.val += carry;

            if (temp.val < 10) return 0;

            temp.val = 0;
            return 1;
        }

        public ListNode addOne(ListNode head) {
            int carry = helper(head);

            if (carry == 1) {
                ListNode newnode = new ListNode(1);
                newnode.next = head;
                head = newnode;
            }
            return head;
        }
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // PSVM (main method)
    public static void main(String[] args) {
        // Create linked list: 1 -> 9 -> 9
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        Solution sol = new Solution();
        head = sol.addOne(head);

        System.out.print("After Adding One: ");
        printList(head);
    }
}