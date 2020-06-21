package lesson6.activity61;

public abstract class Staff {
    //chang class name to Staff because Employee have already been used in Activity 52
    private String name,numberIdentification;
    private int age;
    //initialization
    public Staff(String name, int age, String numberIdentification)
    {
        this.name = name;
        this.age = age;
        this.numberIdentification = numberIdentification;
    }
    public Staff()
    {
        this("",0,"");
    }
  //  setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberIdentification(String numberIdentification) {
        this.numberIdentification = numberIdentification;
    }
    //getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNumberIdentification() {
        return numberIdentification;
    }
    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract long getWorkingCount();
    public long calculateSalary()
    {
        return (long)(getMealAllowance()+getSalaryRate()*getWorkingCount());
    }

}
