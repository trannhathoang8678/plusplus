package lesson5.acitivity52;

public class Employee extends Offcial {
    private String work;
    public Employee(String name, String sex, int age,String work)
    {
        super(name,sex,age);
        this.work =work;
    }
    public Employee()
    {
        this("","",0,"");
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }
}
