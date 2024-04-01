package LinkedlistPrac;

import java.util.LinkedList;

public class LinkedListPractise {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedList(Node Head)
    {
        Node curr = Head;
        Node prev = null;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }
        return prev;
    }


    public static void printLinkedList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println(); // Print a newline for better formatting
    }

    public static void main(String[] args) {

        Node Head = new Node("Element 1");
        Node node2 = new Node("Element 2");
        Node node3 = new Node("Element 3");
        Head.next = node2;
        node2.next = node3;
        printLinkedList(Head);

        Node updatedHead = reverseLinkedList(Head);
        System.out.println("Reversed Linked List");
        printLinkedList(updatedHead);


    }


}
