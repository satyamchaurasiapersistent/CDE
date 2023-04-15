package linkedlist.reverse;


import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList mylist = new MyLinkedList();
        mylist.head = new Node(85);
        mylist.head.next = new Node(15);
        mylist.head.next.next = new Node(4);
        mylist.head.next.next.next = new Node(20);

        System.out.println("Given List is : ");
        mylist.printList(mylist.head);

        System.out.println("Reverse List Using Three Pointers is : ");
        //Using Three pointer
        //mylist.printList(mylist.reverseNode(mylist.head));

        //Using Recursion
        //mylist.printList(mylist.reverseNodeRecursion(mylist.head));

        //Using Tail Recursion
        mylist.printList(mylist.reverseNodeTailRecursion(mylist.head,null));

    }
}
