package Linklsit;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("enter the value");
        Scanner sc = new Scanner(System.in);
        Linklist l = new Linklist();
        l = l.insert(l, 1);
        l = l.insert(l, 32);
        l = l.insert(l, 345);
        l = l.insert(l, 15);
        l.printList(l);
    }
}
