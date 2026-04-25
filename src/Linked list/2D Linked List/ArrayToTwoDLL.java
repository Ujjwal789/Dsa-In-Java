public class ArrayToTwoDLL {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        node head = convert(arr);
        head = firstDelete(head);

        // print list
        for (node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " <==> ");
        }
        System.out.println("null");
        System.out.println("Length: " + arr.length);
    }
    static class node{
        int data;
        node next;
        node prev;

        node (int data){
        this.data = data;
        }

    }
    static node convert(int[] arr){
        if(arr.length == 0){
            return null;
        }

        node head =  new node(arr[0]);
        node prev = head;
        for (int i = 1; i < arr.length; i++) {
         node newnode = new node(arr[i]);
            prev.next =newnode;
            newnode.prev=prev;

            prev =newnode;

        }
        return  head;
    }
    // function to delete head
    public static node firstDelete(node head) {
        if(head == null){
            return null;
        }
        if (head.next == null){
            return null;
        }

        head = head.next;
        head.prev =null;


        return head;
    }
}
