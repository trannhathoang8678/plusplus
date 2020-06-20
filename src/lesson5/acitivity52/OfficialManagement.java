package lesson5.acitivity52;

public class OfficialManagement {
    private Worker[] workers;
    private Engineer[] engineers;
    public OfficialManagement(Worker[] workers, Engineer[] engineers)
    {
        this.workers = workers;
        this.engineers = engineers;
    }
    public OfficialManagement()
    {
        workers = new Worker[1];
        workers[0] = new Worker();
        engineers = new Engineer[1];
        engineers[0] = new Engineer();
    }
    public int[] workerLevel(int level)
    {
        int cnt=0;
        for(int i = 0; i < workers.length; i++)
            if(workers[i].getLevel() == level)
                cnt++;
            int[] res= new int[cnt];
            cnt = -1;
        for(int i = 0; i < workers.length; i++)
            if(workers[i].getLevel() == level)
            {
                cnt++;
                res[cnt] = i;
            }
        return res;
    }
    public int[] engineerMajor(String major) {
        int cnt = 0;
        for (int i = 0; i < engineers.length; i++)
            if (engineers[i].getMajor() .equals( major))
                cnt++;
        int[] res = new int[cnt];
        cnt = -1;
        for (int i = 0; i < engineers.length; i++)
            if (engineers[i].getMajor().equals(major)) {
                cnt++;
                res[cnt] = i;
            }
        return res;
    }
}
