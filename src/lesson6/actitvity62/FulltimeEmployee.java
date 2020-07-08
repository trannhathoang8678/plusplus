package lesson6.actitvity62;

public class FulltimeEmployee extends Employee {
    private int dayWorkingBonus;
    private int baseSalary;
    public FulltimeEmployee(String name, int age, char sex, boolean isBoss,int dayWorkingBonus) {
        super(name, age, sex);
        if (isBoss)
        {

            this.baseSalary = 20000000;
        }
        else
        {
            this.baseSalary = 10000000;
        }
        this.dayWorkingBonus = dayWorkingBonus;
    }

    public FulltimeEmployee() {
    }


    public int salary() {
        return (dayWorkingBonus*800000 + baseSalary );
    }
}
