public class Treversal {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {
        Node head;

        // Build linked list from array
        void fromArray(int[] arr) {
            if (arr.length == 0) return;
            head = new Node(arr[0]);
            Node curr = head;
            for (int i = 1; i < arr.length; i++) {
                curr.next = new Node(arr[i]);
                curr = curr.next;
            }
        }

        // Traversal: check if key exists
        boolean contains(int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        LinkedList list = new LinkedList();
        list.fromArray(arr);  // build the list first

        int key = 5;
        System.out.println(list.contains(key));  // true
        System.out.println(list.contains(10));   // false
    }
}