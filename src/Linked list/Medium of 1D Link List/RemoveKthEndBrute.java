public class RemoveKthEndBrute {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeKthFromEnd(Node head, int k) {
        if (head == null) return null;

        // Step 1: find length
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // if removing head
        if (k == len) {
            return head.next;
        }

        // Step 2: go to (len - k)th node
        int pos = len - k;
        temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // Step 3: delete node
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public  void main(String[] args) {

        // create list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        int k = 2; // remove 2nd node from end (node 4)

        head = removeKthFromEnd(head, k);

        System.out.println("After removing " + k + "th node from end:");
        printList(head);
    }
}