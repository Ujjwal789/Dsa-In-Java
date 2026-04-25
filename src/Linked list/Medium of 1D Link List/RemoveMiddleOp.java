public class RemoveMiddleOp {

        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public static ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) return null;
            int count = 0;
            ListNode temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            int res = count/2;
            temp = head;
            while(temp != null){
                res--;
                if(res == 0){
                    ListNode middle = temp.next;
                    temp.next= temp.next.next;
                }
                temp = temp.next;
            }
            return head;
        }
        public static void printList(ListNode head) {
            if (head == null) {
                System.out.println("Empty List");
                return;
            }
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + (temp.next != null ? " -> " : ""));
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1,
                    new ListNode(2,
                            new ListNode(3,
                                    new ListNode(4,
                                            new ListNode(5)))));

            System.out.println("Original List:");
            printList(head);

            head = deleteMiddle(head);

            System.out.println("List after removing middle:");
            printList(head);
        }
}
