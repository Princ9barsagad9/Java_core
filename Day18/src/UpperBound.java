import java.util.List;

public class UpperBound {
    static double printSum(List<? extends Number>numbers){
        double sum=0.0;
        for(Number number:numbers){
            sum+=number.doubleValue();
        }
         return sum;
    }

    public static void main(String[] args) {
        System.out.println(printSum(List.of(2.3,4.5,3.1,8.8,9.4)));
    }
}
