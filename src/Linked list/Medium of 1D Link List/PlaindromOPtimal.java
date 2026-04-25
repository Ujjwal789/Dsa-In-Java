public class PlaindromOPtimal {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;

        while (second != null){
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second= second.next;
        }
        return true;
    }
    public static void main(String[] args) {
        PlaindromOPtimal obj = new PlaindromOPtimal();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(4);
        head.next.next.next = obj.new ListNode(2);
        head.next.next.next.next = obj.new ListNode(2);

        obj.printList(head);

        boolean result = obj.isPalindrome(head);
        System.out.println("Is Palindrome: " + result);
    }
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

}




