public class SortLL012 {

    // Definition of singly linked list
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) return head;

            ListNode temp = head;
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;

            // count 0,1,2
            while (temp != null) {
                if (temp.data == 0) {
                    count0++;
                } else if (temp.data == 1) {
                    count1++;
                } else if (temp.data == 2) {
                    count2++;
                }
                temp = temp.next;
            }

            // overwrite values
            temp = head;

            while (temp != null) {
                if (count0 > 0) {
                    temp.data = 0;
                    count0--;
                } else if (count1 > 0) {
                    temp.data = 1;
                    count1--;
                } else {
                    temp.data = 2;
                    count2--;
                }
                temp = temp.next;
            }

            return head;
        }
    }
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        SortLL012 outer = new SortLL012();
        Solution sol = outer.new Solution();

        // create list: 2 -> 1 -> 0 -> 2 -> 1 -> 0
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(0);

        System.out.print("Original list: ");
        printList(head);

        head = sol.sortList(head);

        System.out.print("Sorted list: ");
        printList(head);
    }
}