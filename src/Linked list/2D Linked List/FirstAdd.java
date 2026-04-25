public class FirstAdd {
        public static void main(String[] args) {
            node head = new node(11);
            head.next = new node(22);
            head.next.prev = head;
            head.next.next = new node(33);
            head.next.next.prev = head.next;

            head = firstadd(head);

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
        public static node firstadd(node head){
            node newnode = new node(99);
            if(head == null){
                return newnode;
            }
            newnode.next =head;
            head.prev= newnode;

            return newnode;
        }

}




