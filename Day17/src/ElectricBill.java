import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter how much units you have Consumed in This Month: ");
        int n=scanner.nextInt();
        double m;
        double gst;
        if(n<=100){
            m=n*2.96;
            System.out.println("Your Energy Bill is: "+m+"RS");
            gst=(0.8/m)*100;
            System.out.println("GST of your amount is: "+gst);
            System.out.println("*****[Total Amount Payble]*****: "+(m+gst)+"Rs");
        }else if(n>100 && n<=300){
            m=n*5.56;
            System.out.println("Your Energy Bill is: "+m+"Rs");
            gst=(0.8/m)*100;
            System.out.println("GST of your amount is: "+gst);
            System.out.println("*****[Total Amount Payble]*****: "+(m+gst)+"Rs");
        }else if(n>300 && n<=500){
            m=n*9.16;
            System.out.println("Your Energy Bill is: "+m+"Rs");
            gst=(0.8/m)*100;
            System.out.println("GST of your amount is: "+gst);
            System.out.println("*****[Total Amount Payble]*****: "+(m+gst)+"Rs");
        }else if(n>500){
            m=n*10.61;
            System.out.println("Your Energy Bill is: "+m+"Rs");
            gst=(0.8/m)*100;
            System.out.println("GST of your amount is: "+gst);
            System.out.println("*****[Total Amount Payble]*****: "+(m+gst)+"Rs");
        }
    }
}
