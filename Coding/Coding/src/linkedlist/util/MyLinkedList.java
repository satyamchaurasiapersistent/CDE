package linkedlist.util;

public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
    }

    public void printList(Node headNode) {
       // int count =0;
        while (headNode != null) {
           // if(count==300) return;
            System.out.print(headNode.data + " --> ");
            headNode = headNode.next;
          //  count++;
        }
    }



    //Reverse Using Three Nodes time comp is O(N) and Space comp is O(1)
    public Node reverseNode(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }


    //Reverse Using Recursion time comp is O(N) and Space comp is O(N)
    public Node reverseNodeRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node lastNode = reverseNodeRecursion(head.next);
        head.next.next=head;
        head.next=null;

        return lastNode;

    }


    //Reverse Using tail Recursion time comp is O(N) and Space comp is O(N)
    public Node reverseNodeTailRecursion(Node current,Node prev){
        if(head == null) return head;

        if(current.next == null){
            head=current;
            current.next=prev;
            return head;
        }

        Node Next=current.next;
        current.next=prev;
        reverseNodeTailRecursion(Next,current);

        return head;

    }

}
