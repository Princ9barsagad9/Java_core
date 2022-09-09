import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
          list.add(34);
          list.add(54);
          list.add(12);
          list.add(34);
        System.out.println("array list before sorting: "+list);
       Collections.sort(list);
        System.out.println("array list after sorting: "+list);
    }

}
