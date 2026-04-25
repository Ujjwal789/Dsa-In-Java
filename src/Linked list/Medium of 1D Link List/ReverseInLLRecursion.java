public class ReverseInLLRecursion {
    public static void main(String[] args) {
           node head = new node(1);
           head.next = new node(2);
           head.next.next = new node(3);
           head.next.next.next = new node(4);
           head.next.next.next.next = new node(5);

        System.out.print("Original: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed: ");
        printList(head);

    }static void printList(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

  static  class  node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }

    }

        public static node reverseList(node head) {
            if(head == null || head.next == null){
                return head;
            }
            node newHead = reverseList(head.next);
            node front = head.next;
            front.next = head;
            head.next  = null;
            return newHead;

        }

}
