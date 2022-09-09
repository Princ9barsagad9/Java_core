import org.json.simple.JSONObject;

import java.util.Scanner;

public class JsonExampleOne {
    public static void main(String[] args){
      JSONObject obj=new JSONObject();
      obj.put("prince",123);
      obj.put("anand",127);
      obj.put("yash",124);
      obj.put("chetan",125);
      obj.put("dikshita",110);
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter name of employee: ");
        String s1=scanner.next();
        switch(s1){
            case "prince":
                System.out.println(obj.get("prince"));
                      break;
            case "yash":
                System.out.println(obj.get("yash"));
                break;
            case "anand":
                System.out.println(obj.get("anand"));
                break;
            case "chetan":
                System.out.println(obj.get("chetan"));
                break;
            case "dikshita":
                System.out.println(obj.get("dikshita"));
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
