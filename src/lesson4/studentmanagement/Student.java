package lesson4.studentmanagement;

public class Student {
    private String name;
    private float gpa;
    public Student(String name,float gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }
    //getters
    public String getName() {
        return name;
    }
    public float getGpa() {
        return gpa;
    }
    //setters
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    // check if students pass of fail
    public boolean pass()
    {
        if(gpa >= 1.5) return true;
        else return false;
    }
    // print properties
    public void write()
    {
        System.out.println("Name: " + name);
        System.out.println("GPA :" + gpa);
    }
}
