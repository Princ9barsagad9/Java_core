public class Employee extends Person{
    private String ename;
    private int eid;

    public Employee(String ename) {
        this.ename = ename;
        System.out.println("employee");
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
}
