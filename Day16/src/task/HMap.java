package task;

import java.util.HashMap;
import java.util.Scanner;

public class HMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(121,"prince");
        hashMap.put(122,"Anand");
        hashMap.put(123,"yash");
        hashMap.put(124,"chetan");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter key and value:");
        int n=scanner.nextInt();
        String s= scanner.nextLine();
        String str= scanner.nextLine();
        if(hashMap.containsKey(n) && hashMap.containsValue(str)){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
    }
}
