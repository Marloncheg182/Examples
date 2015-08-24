package Interview.LinkedList.MiddleElement;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class LinkedList {
    private Node head;
    private static class Node{
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        }else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.format("d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public Node findMiddleNode(Node head){
        Node fastPtr = head;
        Node slowPtr = head;

        int i = 0;
        while (fastPtr.next !=null){
            if (i==0){
                fastPtr = fastPtr.next;
                i = 1;
            }else if (i ==1){
                fastPtr = fastPtr.next;
                slowPtr = slowPtr.next;
            }
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList();

        Node middle = list.findMiddleNode(head);
        System.out.println("Midle node will be: " + middle.value);
    }
}
