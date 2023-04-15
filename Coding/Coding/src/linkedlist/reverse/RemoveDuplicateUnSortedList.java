package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

import java.util.HashMap;

public class RemoveDuplicateUnSortedList {
    public static Node removeDuplicateUnsortedList(Node head) {
        HashMap<Integer, Integer> countMapping = new HashMap<>();
        Node temp = head;
        Node prev =null;
        while (temp != null) {
            countMapping.putIfAbsent(temp.data, 0);
            countMapping.put(temp.data, countMapping.get(temp.data) + 1);
            if (countMapping.get(temp.data) > 1) {
                prev.next=temp.next;
            }else{
                prev=temp;
            }

            temp = temp.next;

        }
        return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.head = new Node(5);
        list.head.next = new Node(2);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(2);

        list.printList(removeDuplicateUnsortedList(list.head));

    }
}
