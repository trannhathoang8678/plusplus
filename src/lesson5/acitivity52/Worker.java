package lesson5.acitivity52;

import java.util.logging.Level;

public class Worker extends Offcial {
    private int level;
    //initialization
    public Worker(String name,String sex, int age,int level)
    {
        super(name,sex,age);
        this.level = level;
    }
    public Worker()
    {
        this("","",0,0);
    }
    //setter
    public void setLevel(int level) {
        this.level = level;
    }
    //getter
    public int getLevel() {
        return level;
    }
    //print properties
    public void properties()
    {
        System.out.println("Name: " + super.getName());
        System.out.println("Sex: " + super.getSex());
        System.out.println("Age: " + super.getAge());
        System.out.println("Level: " + level);
    }

}
