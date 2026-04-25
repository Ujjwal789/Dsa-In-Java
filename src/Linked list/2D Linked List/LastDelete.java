public class LastDelete {
    public static void main(String[] args) {
        node head = new node(11);
        head.next = new node(22);
        head.next.prev = head;
        head.next.next = new node(33);
        head.next.next.prev = head.next;

        head = lastDelete(head);

        // print list
        for (node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " <==> ");
        }
        System.out.println("null");

    }
    static class node{
        int data;
        node next;
        node prev;

        node(int data){
            this.data=data;
        }
    }
    public static node lastDelete(node head){
        if(head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }
        node temp = head;
        while (temp.next.next != null){
            temp = temp.next;


        }
         temp.next = null;
        return head;
    }

}


