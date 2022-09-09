import java.util.ArrayList;
import java.util.Scanner;

public class TableRunner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(8);
        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        System.out.println("enter which table you want to print: ");
        int n=scanner.nextInt();
        arrayList.stream().forEach(element-> System.out.println(n+" * "+element+" = "+element*n));
    }
}
