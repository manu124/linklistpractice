package Linklsit;

class Linklist {
    Node head;

    public Linklist insert(Linklist list, int data) {
        Node currentNode = new Node(data);
        if (list.head == null) {
            System.out.println("This is the first node");
            list.head = currentNode;
        } else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = currentNode;
        }
        return list;
    }

    public void printList(Linklist list) {
        Node currentNode = list.head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

}