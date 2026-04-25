import java.util.HashMap;

public class findLengthLoop {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }
    public int findLengthOfLoop(ListNode head) {
        ListNode temp = head;
        int time = 0;
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp)){
                int value = time-map.get(temp);
                return value;
            }
            map.put(temp,time);
            temp = temp.next;
            time++;

        }
        return 0;
    }
    public static void main(String[] args) {
        findLengthLoop obj = new findLengthLoop();

        // Creating nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating loop
        fifth.next = second;

        // Finding loop length
        int loopLength = obj.findLengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }

}
