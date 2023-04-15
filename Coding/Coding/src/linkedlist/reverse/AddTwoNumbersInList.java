package linkedlist.reverse;

import linkedlist.util.MyLinkedList;
import linkedlist.util.Node;

public class AddTwoNumbersInList {

    public static Node reverseNode(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static Node addTwoNumber(Node headOfListOne, Node headOfListTwo) {
        Node revListOne = reverseNode(headOfListOne);
        Node revListTwo = reverseNode(headOfListTwo);
        Node prevTwo = null;
        headOfListOne=revListOne;
        headOfListTwo=revListTwo;
        int carry = 0;
        while (revListOne != null && revListTwo != null) {
            int data = revListOne.data + revListTwo.data+carry;
            if (data > 9) {
                carry = data / 10;
                revListOne.data = data % 10;
                revListTwo.data = data % 10;
            } else {
                revListOne.data = data;
                revListTwo.data = data;
                carry = 0;
            }
            revListOne = revListOne.next;
            prevTwo=revListTwo;
            revListTwo = revListTwo.next;
        }
        boolean listOneLenExceed=false;
        boolean listTwoLenExceed=false;

        if (revListOne==null && revListTwo!=null) {
            while(revListTwo!=null){
                revListTwo.data= revListTwo.data+carry;
                carry=0;
                listTwoLenExceed=true;
                revListTwo=revListTwo.next;
            }
        } else if (revListTwo==null && revListOne!=null) {
            while(revListOne!=null){
                revListOne.data= revListOne.data+carry;
                carry=0;
                listOneLenExceed=true;
                revListOne=revListOne.next;
            }
        }else{
            if(carry>0){
                Node newNode = new Node(carry);
                prevTwo.next=newNode;
            }
        }
        if(listOneLenExceed){
            return reverseNode(headOfListOne);
        }else{
            return reverseNode(headOfListTwo);

        }
    }

    public static void main(String[] args) {
        MyLinkedList listOne = new MyLinkedList();
        listOne.head = new Node(3);
        listOne.head.next = new Node(3);
        listOne.head.next.next = new Node(1);
        listOne.head.next.next.next = new Node(1);

        MyLinkedList listTwo = new MyLinkedList();
        listTwo.head = new Node(9);
        listTwo.head.next = new Node(8);
        listTwo.head.next.next = new Node(8);
        listTwo.head.next.next.next = new Node(9);

        System.out.println("List One Items ");
        listOne.printList(listOne.head);
        System.out.println("\nList Two Items ");
        listTwo.printList(listTwo.head);

        System.out.println("\n\nSum Of Numbers is :");
        listOne.printList(addTwoNumber(listOne.head,listTwo.head));

    }
}
