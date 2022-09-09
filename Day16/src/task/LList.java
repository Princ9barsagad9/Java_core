package task;

import java.util.LinkedList;
import java.util.Scanner;

public class LList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(23);
        linkedList.add(56);
        linkedList.add(78);
        linkedList.add(84);
        linkedList.add(91);
        System.out.println("Linked List before insertion: "+linkedList);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first and last element");
        int f=scanner.nextInt();
        int l=scanner.nextInt();
        linkedList.add(0,f);
        linkedList.add(linkedList.size(),l);
        System.out.println("Linked List after insertion: "+linkedList);
    }
}
