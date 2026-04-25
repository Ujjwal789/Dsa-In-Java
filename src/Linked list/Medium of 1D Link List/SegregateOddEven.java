import java.util.*;
public class SegregateOddEven {
     static class  ListNode {
        public int data;
        public ListNode next;

        ListNode() {
            data = 0;
            next = null;
        }

        ListNode(int x) {
            data = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            data = x;
            this.next = next;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ArrayList<Integer> list = new ArrayList<>();
            ListNode temp = head;

            // Odd index nodes
            while (temp != null && temp.next != null) {
                list.add(temp.data);
                temp = temp.next.next;
            }
            if (temp != null) list.add(temp.data);

            // Even index nodes
            temp = head.next;
            while (temp != null && temp.next != null) {
                list.add(temp.data);
                temp = temp.next.next;
            }
            if (temp != null) list.add(temp.data);

            // Rewrite values into list
            temp = head;
            for (int value : list) {
                temp.data = value;
                temp = temp.next;
            }

            return head;
        }

        public static void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Function to create linked list from array
        public static ListNode createList(int[] arr) {
            if (arr.length == 0) return null;

            ListNode head = new ListNode(arr[0]);
            ListNode temp = head;

            for (int i = 1; i < arr.length; i++) {
                temp.next = new ListNode(arr[i]);
                temp = temp.next;
            }
            return head;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            ListNode head = createList(arr);

            System.out.println("Original List:");
            printList(head);


            head = oddEvenList(head);

            System.out.println("After Odd-Even Rearrangement:");
            printList(head);
        }

}
