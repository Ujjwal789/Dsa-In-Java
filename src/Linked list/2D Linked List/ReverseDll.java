public class ReverseDll {

    static class ListNode {
        int data;
        ListNode prev, next;

        ListNode(int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }

    public static ListNode reverseDLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode last = null;

        while (current != null) {
            ListNode temp = current.next;

            // Swap next and prev
            current.next = current.prev;
            current.prev = temp;

            last = current;
            current = temp;
        }
        return last;
    }

    public static void main(String[] args) {
        // Create DLL: 11 <-> 22 <-> 33
        ListNode head = new ListNode(11);
        head.next = new ListNode(22);
        head.next.prev = head;
        head.next.next = new ListNode(33);
        head.next.next.prev = head.next;

        // Reverse DLL
        head = reverseDLL(head);

        // Print list
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <==> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}