package DoublyLinklist;

public class DoublyLinkList {
    Node head;

    public DoublyLinkList insert(DoublyLinkList list, int data) {
        Node currentNode = new Node(data);
        if (list.head == null) {
            currentNode.previous = null;
            list.head = currentNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = currentNode;
            currentNode.previous = last;

        }
        return list;
    }

    public void show(DoublyLinkList list) {
        Node current = list.head;
        Node last = null;
        while (current != null) {
            System.out.println(current.data);
            last = current;
            current = current.next;
        }
        System.out.println("different");
        while (last.previous != null) {
            System.out.println(last.data);
            last = last.previous;
        }
        System.out.println(last.data);
        System.out.println("hello sanii");
    }

    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int d) {
            data = d;
            previous = null;
            next = null;
        }
    }
}
