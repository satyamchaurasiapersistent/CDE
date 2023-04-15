package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class AddOneToList {

    public static int findCarry(Node head) {
        int carry = 0;
        if (head == null) {
            return 1;
        }

        if (head != null) {
            carry = head.data + findCarry(head.next);
        }
        head.data=carry%10;
        return carry/10;

    }

    public static Node addOneToList(Node head) {

        int carry = findCarry(head);

        if (carry > 0) {
            Node nodeobj = new Node(carry);
            nodeobj.next = head;
            head = nodeobj;
        }

        return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(7);
        list.head.next = new Node(8);
        list.head.next.next = new Node(5);

        list.printList(list.head);
        System.out.println("\nList After adding one : ");
        list.printList(addOneToList(list.head));

    }
}
