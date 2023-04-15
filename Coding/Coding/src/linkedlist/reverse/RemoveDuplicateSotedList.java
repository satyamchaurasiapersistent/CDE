package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class RemoveDuplicateSotedList {

    public static Node removeDuplicate(Node head) {
        Node firstNode = head;
        while (firstNode != null && firstNode.next != null) {
            if (firstNode.data == firstNode.next.data) {
                firstNode.next = firstNode.next.next;
            } else {
                firstNode = firstNode.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        MyLinkedList List = new MyLinkedList();
        List.head = new Node(2);
        List.head.next = new Node(2);
        List.head.next.next = new Node(2);
        List.head.next.next.next = new Node(2);

        List.printList(removeDuplicate(List.head));
    }
}
