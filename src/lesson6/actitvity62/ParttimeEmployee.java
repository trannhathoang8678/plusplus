package lesson6.actitvity62;

public class ParttimeEmployee extends Employee {
    private int hourWorking;

    public ParttimeEmployee(String name, int age, char sex, int hourWorking) {
        super(name, age, sex);
        this.hourWorking = hourWorking;
    }
    public ParttimeEmployee() {
    }

    public void setHourWorking(int hourWorking) {
        this.hourWorking = hourWorking;
    }

    public int salary()
    {
        return (hourWorking*100000);
    }
}

