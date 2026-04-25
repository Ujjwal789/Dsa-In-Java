    public class DeleteKthnode {
        static  class node{
            int data;
            node next;

            node(int data){
                this.data = data;

            }
        }
        public static node removek(node head, int k){
            if(head == null)return head;
            if(k == 1){
                head = head.next;
            }
            int count = 0;
            node temp = head;
            node prev = null;

            while (temp!=null){
                count++;
                if (count == k) {
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }

        public static void main(String[] args) {
            node head = new node(1);
            head.next = new node(2);
            head.next.next = new node(3);
            head.next.next.next = new node(4);

            int k =3;
            head =removek(head,k);


            printList(head);
        }

        public static void printList(node head) {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
