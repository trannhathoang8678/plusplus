package lesson6.activity61;

public class ParttimeStaff extends  Staff {
    private int totalWorkingShift;
    long baseSalary;
    private final long MEAL_ALLOWANCE = 0;
    //initialization
    public ParttimeStaff(String name,int age,String numberIdentification,int totalWorkingShift,long baseSalary)
    {
        super(name,age,numberIdentification);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }
    public ParttimeStaff()
    {
        super();
        totalWorkingShift = 0;
        baseSalary = 0;
    }
    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return totalWorkingShift;
    }

    @Override
    public long getWorkingCount() {
        return baseSalary;
    }

    
}
