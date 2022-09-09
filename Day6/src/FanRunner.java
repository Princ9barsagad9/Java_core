public class FanRunner {
    public static void main(String[] args) {
        Fan fan=new Fan("myfan",3,"blue");
        fan.switchOn();
        fan.print();
        fan.swutchOff();
        fan.print();
    }
}
