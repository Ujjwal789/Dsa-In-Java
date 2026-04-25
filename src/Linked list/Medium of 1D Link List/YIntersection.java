public class YIntersection {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            val = data;
            next = null;
        }

        ListNode(int data, ListNode nextNode) {
            val = data;
            next = nextNode;
        }
    }

    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;

            ListNode temp1 = headA;
            ListNode temp2 = headB;

            while (temp1 != temp2) {
                temp1 = (temp1 == null) ? headB : temp1.next;
                temp2 = (temp2 == null) ? headA : temp2.next;
            }
            return temp1;
        }
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8, new ListNode(10));

        ListNode headA = new ListNode(3, new ListNode(7, common));
        ListNode headB = new ListNode(99, new ListNode(1, common));

        System.out.print("List A: ");
        printList(headA);

        System.out.print("List B: ");
        printList(headB);

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}