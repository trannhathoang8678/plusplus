package lesson4.activity43;

public class QuestionManagement {
    private Question[] questions;
    // initialization
    public QuestionManagement(Question[] questions)
    {
        this.questions = questions;
    }
    public  QuestionManagement()
    {
        questions = new Question[1];
        questions[0] = new Question();
    }
    // get score
    public int point()
    {
        int score=0;
        for(int i = 0; i < questions.length;i++ )
            if(questions[i].checkAnswer()) score++;
            return score;
    }
    // questions at the same level
    public int[] questionLevel(int level)
    {
        int cnt = 0;
        for(int i = 0; i < questions.length;i++ )
            if(questions[i].getLevel() == level)
                cnt++;
            int[] res = new int[cnt];
            cnt = -1;
        for(int i = 0; i < questions.length;i++ )
            if(questions[i].getLevel() == level)
            {
                cnt++;
                res[cnt]=i;
            }
        return res;
    }
    // answer
    public void reply(int i,char c)
    {
        questions[i].reply(c);
    }
}
