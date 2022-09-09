package task;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(121,"prince");
        treeMap.put(126,"Anand");
        treeMap.put(125,"yash");
        treeMap.put(124,"chetan");
        System.out.println("TreeMap: " + treeMap);
        Comparator comparator = treeMap.comparator();
        System.out.println("Comparator value: " + comparator);
    }
}
