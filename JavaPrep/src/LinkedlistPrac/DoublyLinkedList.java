package LinkedlistPrac;

public class DoublyLinkedList {

    static class Node
    {
        int data;
        Node previous;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    static class DoublyLinkedListMethods
    {
        Node Head;
        Node tail;

        public void addNode(int element)
        {
            Node temp = new Node(element);
            if(Head == null)
            {
                Head = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                temp.previous = tail;
                tail = temp;
            }
        }

        public void printDoublyLinkedList()
        {
            Node curr = Head;

            while(curr != null)
            {
                System.out.println(curr.data);
                curr = curr.next;
            }
        }

        public void reverseLinkedList() {
            Node curr = Head;
            Node temp = null;

            while (curr != null) {
                temp = curr.previous;
                curr.previous = curr.next;
                curr.next = temp;
                curr = curr.previous;
            }

            // After the loop, update the head
            if (temp != null) {
                Head = temp.previous; // Update Head to the last node of the reversed list
            }
        }

    }

    public static void main(String[] args) {
        DoublyLinkedListMethods dl = new DoublyLinkedListMethods();
        dl.addNode(2);
        dl.addNode(4);
        dl.addNode(6);
        dl.addNode(8);
        dl.printDoublyLinkedList();
        dl.reverseLinkedList();
        System.out.println("Reversed Linked List");
        dl.printDoublyLinkedList();


    }
}
