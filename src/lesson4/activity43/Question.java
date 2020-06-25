package lesson4.activity43;

public class Question {
    private String content, answer1, answer2, answer3, answer4;
    private int level;
    char rightAnswer,answer;
    // initialization
    public Question(String content, String answer1, String answer2, String answer3, String answer4, char rightAnswer, int level) {
        this.content = content;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightAnswer = rightAnswer;
        this.level = level;
    }

    public Question() {
        this("Guess", "A", "B", "C", "D", 'A', 0);
    }
    //getters

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public int getLevel() {
        return level;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getContent() {
        return content;
    }

    public String getAnswer4() {
        return answer4;
    }

    public char getRightAnswer() {
        return rightAnswer;
    }
    //setters

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRightAnswer(char rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    //answer
    public void reply(char answer)
    {
        this.answer=answer;
    }
    //check if the answer is right or wrong
    public boolean checkAnswer()
    {
        if(answer==rightAnswer)
            return true;
        else return false;
    }
}
