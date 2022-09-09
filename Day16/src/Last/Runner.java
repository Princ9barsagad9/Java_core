package Last;

import java.util.Comparator;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) {
        MyProject myProject=new MyProject();
        TreeMap<Integer,String> treeMap=new TreeMap<>(myProject);
        treeMap.put(121,"prince");
        treeMap.put(126,"Anand");
        treeMap.put(125,"yash");
        treeMap.put(124,"chetan");
        System.out.println("TreeMap: " + treeMap);
        Comparator comparator = treeMap.comparator();
        System.out.println("Comparator value: " + comparator);
    }
}
