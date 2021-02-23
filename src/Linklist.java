import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class Linklist {
    Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linklist obj = new Linklist();
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1 for push");
            System.out.println("2 for traverse");
            System.out.println("3 for exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.pushend();
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    void pushfront() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int data = sc.nextInt();

    }

    void pushend() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int d = sc.nextInt();
        Node a = new Node();
        a.data = d;
        a.next = head;
        head = a;
    }

    void traverse() {
        Node i;
        for (i = head; i != null; i = i.next) {
            System.out.println(i.data);
        }
    }
}
