import java.sql.SQLOutput;

class Task1 extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.print("welcome ");
        }
    }
}

public class WelcomeMorning {
    public static void main(String[] args) {
        System.out.println("task 1 started");
        Task1 task1=new Task1();
        task1.start();
        System.out.println("task 2 started");
        for(int i=1;i<100;i++){
            System.out.print("GoodMorning ");
        }
    }
}
