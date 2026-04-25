public class FindMedium {
    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);

        // Find the middle node
        node middleNode = findMiddleofLL(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNode.data);

    }
    static class  node{
        int data;
        node next;

        node (int data, node next){
            this.data = data;
            this.next = next;

        }
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     static node findMiddleofLL(node head){
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
