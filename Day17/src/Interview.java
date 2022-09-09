import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        for (int i=0;i<=5;i++){
            for(int k=i+1;k<5;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
