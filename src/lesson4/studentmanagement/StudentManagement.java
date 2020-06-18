package lesson4.studentmanagement;

public class StudentManagement {
    private Student[] students;
    private int numberOfStudents;
    public StudentManagement(Student[] students)
    {
        this.students = students;
        numberOfStudents = students.length;
    }
    public int numberOfPass()
    {
        int cnt=0;
        for(int i = 0; i < numberOfStudents; i++)
            if (students[i].pass())
                cnt++;
            return cnt;
    }
    public int numberOfFail()
    {
        int cnt=0;
        for(int i = 0; i < numberOfStudents; i++)
            if (!students[i].pass())
                cnt++;
        return cnt;
    }
    public int highestStudent()
    {
        float max = 0;
        int id=0;
        for(int i = 0;i < numberOfStudents;i++)
            if(students[i].getGpa() > max)
            {
                id=i;
                max=students[i].getGpa();
            }
        return id;
    }
    public int lowestStudent()
    {
        float min = 2000000000 ;
        int id=0;
        for(int i = 0;i < numberOfStudents;i++)
            if(students[i].getGpa() < min)
            {
                id = i;
                min = students[i].getGpa();
            }
        return id;
    }
}
