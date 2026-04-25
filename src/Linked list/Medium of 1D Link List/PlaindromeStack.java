import java.util.Stack;

public class PlaindromeStack {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            if(temp.val != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;

    }
    public static void main(String[] args) {
        PlaindromeStack obj = new PlaindromeStack();

        PlaindromeStack.ListNode head = obj.new ListNode(1);
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