package lesson5.acitivity52;

public class Engineer extends Offcial {
    private String major;
    public Engineer(String name, String sex, int age, String major)
    {
        super(name,sex,age);
        this.major = major;
    }
    public Engineer()
    {
        this("","",0,"");
    }
    //setter
    public void setMajor(String major) {
        this.major = major;
    }
    //getter
    public String getMajor() {
        return major;
    }
    //print properties
    public void properties()
    {
        System.out.println("Name: " + super.getName());
        System.out.println("Sex: " + super.getSex());
        System.out.println("Age: " + super.getAge());
        System.out.println("Major: " + major);
    }
}
