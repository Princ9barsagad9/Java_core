package task;

import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
     TreeSet<String> treeSet=new TreeSet<>();
     treeSet.add("My");
        treeSet.add("name");
        treeSet.add("is");
        treeSet.add("Prince");
        treeSet.add("Barsagade");
        System.out.println("Tree Set is: "+treeSet);
        TreeSet<String> cloneTreeSet=new TreeSet<>();
        cloneTreeSet = (TreeSet)treeSet.clone();
        System.out.println("Cloned Tree Set is: "+cloneTreeSet);
    }
}
