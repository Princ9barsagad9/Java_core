import java.util.ArrayList;

public class PrintDifferentDataTypes {
    public static void main(String[] args) {
       ArrayList<Object> arrayList=new ArrayList<>();
       arrayList.add("prince");
       arrayList.add((byte)1);
       arrayList.add(24.5d);
       arrayList.add('p');
       for(Object a:arrayList){
           System.out.println(a);
       }
    }
}
