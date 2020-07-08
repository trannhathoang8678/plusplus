package lesson6.activity61;

public class FulltimeStaff extends Staff {
    private int totalWorkingDay;
    long dailySalary;

    private final long MEAL_ALLOWANCE = 2000000;
    //initialization
    public FulltimeStaff(String name,int age,String numberIdentification,int totalWorkingDay,long dailySalary)
    {
        super(name,age,numberIdentification);
        this.totalWorkingDay = totalWorkingDay;
        this.dailySalary = dailySalary;
    }
    public FulltimeStaff()
    {
        super();
        totalWorkingDay = 0;
        dailySalary = 0;
    }
    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return totalWorkingDay;
    }

    @Override
    public long getWorkingCount() {
        return dailySalary;
    }

    @Override
    public long calculateSalary() {
        return super.calculateSalary();
    }
}
