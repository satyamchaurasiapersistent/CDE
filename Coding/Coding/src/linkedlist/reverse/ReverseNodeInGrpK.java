package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class ReverseNodeInGrpK {

    static class Lst{
        Node head ;

        public Lst() {
        }
    }

    public static void printList(Node head){
        while(head!= null){
            System.out.print(head.data + " --> ");
            head=head.next;
        }
    }

    public static Node reverseInGrpOfK(Node head,int k){
        Node prev=null;
        Node curr=head;
        Node next=null;
        int cpunt=0;

        while(curr!=null && cpunt<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            cpunt++;
        }

        if(head!=null){
            head.next=reverseInGrpOfK(next,k);
        }
        return prev;
    }

    public static void main(String[] args) {
        Lst MyList= new Lst();
        MyList.head = new Node(1);
        MyList.head.next = new Node(2);
        MyList.head.next.next = new Node(3);
        MyList.head.next.next.next = new Node(4);
        MyList.head.next.next.next.next = new Node(5);
        MyList.head.next.next.next.next.next = new Node(6);
        MyList.head.next.next.next.next.next.next = new Node(7);
        MyList.head.next.next.next.next.next.next.next = new Node(8);

        //Displaying List
        printList(reverseInGrpOfK(MyList.head,2));

    }
}
