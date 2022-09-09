import java.util.*;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> string=new ArrayList<String>();
        string.add("prince");
        string.add("anand");
        string.add("yash");
        string.add("chetan");
        System.out.println("list before sort: "+string);
        Collections.sort(string);
        System.out.println("list after sort: "+string);
    }
}
