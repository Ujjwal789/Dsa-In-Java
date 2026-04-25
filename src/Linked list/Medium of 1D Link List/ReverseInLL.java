public class ReverseInLL {
    public static void main(String[] args) {

        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);

        head = reverse(head);

        printList(head);
    }static void printList(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static node reverse(node head){
        if(head == null){
            return null;
        }
        node curr = head;
        node prev = null;

        while (curr != null){
           node front = curr.next;
           curr.next = prev;
           prev = curr;
           curr = front;


        }
      return  prev;
    }

}
