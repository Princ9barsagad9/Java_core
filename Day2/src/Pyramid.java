public class Pyramid {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int k=7-i;k>1;k--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }System.out.println();
        }
    }
}
