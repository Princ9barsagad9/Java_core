package task;

import java.util.HashSet;

public class HToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("09");
        hashSet.add("45");
        hashSet.add("28");
        hashSet.add("18");
        hashSet.add("20");
        System.out.println("before conversion: "+ hashSet);
        String[] array= new String[hashSet.size()];
        hashSet.toArray(array);
        for(String a:array){
            System.out.println(a);
        }
    }
}
