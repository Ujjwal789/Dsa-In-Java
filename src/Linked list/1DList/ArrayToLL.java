public class ArrayToLL {
    public static void main(String[] args) {   // psvm
        int[] arr = {2, 5, 8, 7};

        Node head = convert(arr);

        // print list
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " -> ");
        }
        System.out.println("null");
        System.out.println("Length: " + arr.length);
    }


        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        static Node convert(int[] arr) {
            Node head = new Node(arr[0]), curr = head;

            for (int i = 1; i < arr.length; i++) {
                curr.next = new Node(arr[i]);
                curr = curr.next;
            }

            return head;
        }

}
