import java.util.Scanner;

public class Fan {
    Scanner scanner=new Scanner(System.in);
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;
    public Fan(String make,double radius,String color){
        this.make=make;
        this.radius=radius;
        this.color=color;
    }
    public void print(){
        System.out.println("make- "+make+" radius- "+radius+" color- "+color+" isOn- "+isOn+" speed- "+speed);
    }

    public void isOn(boolean isOn) {
        this.isOn=isOn;
    }

    public void speed(int speed) {
        this.speed=(byte)speed;
    }

    public void switchOn() {
        this.isOn(true);
        System.out.println("set speed");
        int i=scanner.nextInt();
        speed(i);
    }

    public void swutchOff() {
        this.isOn(false);
        this.speed=(byte)0;
    }
}
