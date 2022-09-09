public class DownTriangleRight {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int r=0;r<(i-1);r++){
                System.out.print("  ");
            }
            for(int j=i;j<=7;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
