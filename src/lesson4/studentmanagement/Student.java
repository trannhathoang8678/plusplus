package lesson4.studentmanagement;

public class Student {
    private String name;
    private int gpa;
    public Student(String name,int gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getGpa() {
        return gpa;
    }
    //setters
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    // check
    public boolean passOrFail()
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
