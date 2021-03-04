package DoublyLinklist;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkList d = new DoublyLinkList();
        System.out.println("enter 4 number");
        d = d.insert(d, 2);
        d = d.insert(d, 23);
        d = d.insert(d, 32);
        d = d.insert(d, 43);
        d = d.insert(d, 53);
        d.show(d);
    }
}
