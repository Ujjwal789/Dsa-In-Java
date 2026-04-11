public class AddKthNode {
    static  class node{
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
        node(int data, node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static node addK(node head, int k, int el){
        if(head == null) {
            if (k == 1) {
                return new node(el);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new node(el, head);
        }
        int count = 0;
        node temp = head;

        while (temp!=null){
            count++;
            if (count == (k-1)) {
                node x = new node(el, temp.next);
                temp.next = x;
                break;

            }

            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);

        // Insert 9 at position 2
        head = addK(head, 2, 9);

        // Print updated list
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


