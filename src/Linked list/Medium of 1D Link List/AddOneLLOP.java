public class AddOneLLOP {

        // ListNode definition
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

        // Append at end
        static ListNode append(ListNode head, int value) {
            ListNode newNode = new ListNode(value);
            if (head == null) return newNode;

            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            return head;
        }

        // Print list
        static void printList(ListNode head) {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val);
                curr = curr.next;
            }
            System.out.println();
        }

        static class Solution {

            // Reverse list
            ListNode reverseList(ListNode head) {
                ListNode prev = null;
                ListNode curr = head;

                while (curr != null) {
                    ListNode nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }
                return prev;
            }

            // Add one
            ListNode addOne(ListNode head) {
                head = reverseList(head);

                ListNode curr = head;
                int carry = 1;

                while (curr != null && carry > 0) {
                    int sum = curr.val + carry;
                    curr.val = sum % 10;
                    carry = sum / 10;

                    if (curr.next == null && carry > 0) {
                        curr.next = new ListNode(carry);
                        carry = 0;
                    }

                    curr = curr.next;
                }

                return reverseList(head);
            }
        }

        // PSVM
        public static void main(String[] args) {
            ListNode head = null;

            // Build number: 129
            head = append(head, 1);
            head = append(head, 2);
            head = append(head, 9);

            System.out.print("Original Number: ");
            printList(head);

            Solution sol = new Solution();
            head = sol.addOne(head);

            System.out.print("After Adding One: ");
            printList(head);
        }

}
