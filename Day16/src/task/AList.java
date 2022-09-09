package task;

import java.util.ArrayList;
import java.util.Scanner;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(67);
        arrayList.add(12);
        arrayList.add(34);
        arrayList.add(48);
        System.out.println("array list before insertion: "+arrayList);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter where and waht to insert: ");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        arrayList.add(n,m);
        System.out.println("array list after insertion: "+arrayList);
    }
}
