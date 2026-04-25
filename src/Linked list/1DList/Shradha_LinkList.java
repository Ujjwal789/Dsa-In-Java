import java.util.LinkedList;

public class Shradha_LinkList {
    node head;

    private int size;
   public Shradha_LinkList(){
        size=0;
    }

    static class node{

        String data;
        node  next;

        node(String data){
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data){
        node newnode = new node(data);
        if (head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
        size++;
    }

    public void addlast(String data){
        node newnode = new node(data);
        if (head == null){
            head = newnode;
            return;
        }
        node lastnode = head;
        while(lastnode.next != null) {
            lastnode = lastnode.next;
        }
        lastnode.next = newnode;
        size++;

    }

    public void printlist(){
        node currnode = head;
       while(currnode != null) {
            System.out.print(currnode.data+" -> ");
            currnode = currnode.next;
        }
     System.out.println("null");
    }

    public void removefirst(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void removelast(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if (head.next== null){
            head = null;
            return;
        }

        node secondlast = head;
        node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next = null;
        size--;
    }
    public int size() {
        return size;
    }
    public static void main(String[] args) {
        Shradha_LinkList list = new Shradha_LinkList();
        list.addFirst("this");
        list.addlast("is");
        list.addlast("a");
        list.addlast("list");
        list.printlist();

        list.removefirst();
        list.printlist();

        list.removelast();
        list.printlist();
        System.out.println("Size of list: " + list.size());

        list.addFirst("wkwk");
        System.out.println("Size of list: " + list.size());


    }
}
