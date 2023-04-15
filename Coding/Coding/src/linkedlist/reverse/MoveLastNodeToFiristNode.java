package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class MoveLastNodeToFiristNode {

    public static Node moveNodeToLast(Node head){

        Node temp=head;
        Node prev = null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }

        prev.next=null;
        temp.next=head;
        head=temp;


    return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);

        System.out.println("List Before moving last node to front : ");
        list.printList(list.head);
        System.out.println("\n\nList After moving last node to front : ");
        list.printList(moveNodeToLast(list.head));

    }
}
