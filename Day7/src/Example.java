import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example {
    public static void main(String[] args) {
        List<Integer> i=List.of(2,4,2,5,6,5,7,8,1,5,3);
        System.out.println(i.size());
        List<Integer> j;
        j = new ArrayList(i);
        System.out.println(j.size());
    }
}
