package lesson5.acitivity52;

public class Offcial {
    private String name,sex;
    private int age;
    //initialization
    public  Offcial(String name,String sex,int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Offcial()
    {
        this("Name","Sex",0);
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
