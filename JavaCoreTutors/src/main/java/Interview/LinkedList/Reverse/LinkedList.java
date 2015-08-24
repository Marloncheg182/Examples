package Interview.LinkedList.Reverse;

/**
 * Created by Oleg Romanenchuk on 8/23/2015.
 */
public class LinkedList {
    private Node head;
    private static class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void addToTheLast(Node node){
        if (head == null){
            head = node;
        }else {
            Node temp = head;
            while (temp.next !=null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public void printList(Node head){
        Node temp = head;
        while (temp !=null){
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node currentNode){
        Node previousNode=null;
        Node nextNode;
        while (currentNode!=null)
        {
            nextNode = currentNode.next;

            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));

        list.printList(head);

        Node reverseHead = reverseLinkedList(head);
        System.out.println("After reversing");
        list.printList(reverseHead);

    }
}
