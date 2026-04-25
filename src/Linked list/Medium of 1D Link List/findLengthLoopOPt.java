public class findLengthLoopOPt {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            val = data;
            next = null;
        }
    }

        public int findLengthOfLoop(ListNode head) {
           ListNode fast = head;
           ListNode slow = head;
           while (fast !=null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next;
               if(fast == slow){
                   int count =1;
                   fast = fast.next;
                   while (slow != fast){
                       fast = fast.next;
                       count++;
                   }
                   return count;
               }

           }
            return 0;
        } public static void main(String[] args) {
        findLengthLoopOPt obj = new findLengthLoopOPt();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create loop
        fifth.next = second;

        int loopLength = obj.findLengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found.");
        }
    }
}