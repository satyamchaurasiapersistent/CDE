package linkedlist.reverse;

import linkedlist.util.Node;

public class LoopInLinkedList {
    static class ManualList {
        Node head;
        public ManualList() {
        }
    }

    public static boolean detectLoop(Node head){
        Node slowNode=head;
        Node fastNode=head.next.next;

        while(fastNode!=null){
            if(slowNode==fastNode){
                return true;
            }else{
                slowNode=slowNode.next;
                fastNode=fastNode.next.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ManualList lst = new ManualList();
        lst.head = new Node(1);
        lst.head.next = new Node(2);
        lst.head.next.next = new Node(3);
        lst.head.next.next.next = new Node(4);
        lst.head.next.next.next.next = new Node(5);
        lst.head.next.next.next.next.next = new Node(6);
        lst.head.next.next.next.next.next.next = lst.head.next.next.next.next.next;

        System.out.println("Is List provided cyclic : "+detectLoop(lst.head));


    }
}
