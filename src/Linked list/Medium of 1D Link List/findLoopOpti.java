public class findLoopOpti {


        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }
        public static boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next !=null){
             slow = slow.next;
             fast = fast.next;
             if(fast == slow){
                 return true;
             }
            }
            return false;

        } public static void main(String[] args) {

            // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // 🔁 Create a cycle manually
            // 5 -> points back to node with value 3
            head.next.next.next.next.next = head.next.next;

            // Check cycle
            boolean result = hasCycle(head);

            if (result) {
                System.out.println("Cycle detected in linked list.");
            } else {
                System.out.println("No cycle in linked list.");
            }
        }
}




