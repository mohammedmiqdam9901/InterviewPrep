package LinkedlistPrac;

import java.util.LinkedList;

public class LinkedList2 {


    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int e, Node Head)
    {
        Node temp = new Node(e);
        if(Head == null)
        {
            Head = temp;
        }
        else
        {
            temp.next = Head;
            Head = temp;
        }

        Node curr = Head;

        while(curr!= null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }


    }

    public void addAtIndex(int index, Node Head, int e)
    {
        Node temp = new Node(e);
        Node curr = Head;
        int count =0;

        if(index == 0)
            addFirst(e,Head);
        else
        {
            while(count < index -1)
            {
                curr = curr.next;
                count++;
            }

            temp.next = curr.next;
            curr.next = temp;
        }

        curr = Head;

        while(curr!= null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public void removeLast(Node Head)
    {
        if(Head == null)
            System.out.println("The linked list is empty");
        else if(Head.next == null)
        {
            Head = null;
        }
        else {
            Node curr = Head;
            while(curr.next.next != null)
            {
                curr = curr.next;
            }
            curr.next = null;
        }

        Node curr = Head;

        while(curr!= null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

    public Node reverseList(Node Head)
    {
        Node curr = Head;
        Node next = null;
        Node previous = null;

        while(curr != null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        return previous;
    }

    public void printLinkedList(Node Head)
    {
        Node curr = Head;

        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node Head = new Node(10);
        Node p1 = new Node(11);
        Node p2 = new Node(12);
        Node p3 = new Node(13);

        Head.next = p1;
        p1.next = p2;
        p2.next = p3;


        LinkedList2 ll = new LinkedList2();
//        ll.addFirst(100, Head);
//        ll.addAtIndex(0,Head,99);
//        ll.removeLast(Head);
        ll.printLinkedList(ll.reverseList(Head));




    }
}
