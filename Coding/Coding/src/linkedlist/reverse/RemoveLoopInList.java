package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class RemoveLoopInList {

    public static Node removeLoopFromList(Node head) {

        //if(head == null || head.next ==null) return head;
        Node slow = head;
        Node fast = head.next.next;
        Node prev = null;
        //Find any node in Cycle
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Calculating total number of counts
        int count =0;
        while (slow.next != fast) {
            slow = slow.next;
            count++;
        }

        slow=head;
        fast=head;
        for(int i=0;i<count;i++){
            fast=fast.next;
        }

        System.out.println("Number Of Nodes in cycle : "+count);

        while(fast.next!=slow){
            slow=slow.next;
            fast=fast.next;
        }

        System.out.println("Starting Point of Loop is : "+slow.data);
        fast.next=null;


        return head;

    }


    public static void main(String[] args) {
        MyLinkedList List = new MyLinkedList();
        List.head = new Node(1);
        List.head.next = new Node(2);
        List.head.next.next = new Node(3);
        List.head.next.next.next = new Node(4);
        List.head.next.next.next.next = new Node(5);
        List.head.next.next.next.next.next = new Node(6);
        List.head.next.next.next.next.next.next = new Node(7);
        List.head.next.next.next.next.next.next.next = List.head.next.next.next.next.next.next;

        List.printList(removeLoopFromList(List.head));


    }
}
