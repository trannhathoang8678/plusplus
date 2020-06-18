package lesson4.Activity43;

import java.util.Scanner;

public class Test43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Import questions
        System.out.print("Number of questions: ");
        int n = sc.nextInt(),level;
        Question[] questions = new Question[n];
        for(int i = 0;i < n;i++) {
            String something = "";
            char c;
            questions[i] = new Question();
            System.out.println("Question " + (i + 1) + ":");
            System.out.print("Import  content: ");
            something = sc.nextLine();
            something = sc.nextLine();
            questions[i].setContent(something);

            System.out.print("Import answer A: ");
            something = sc.nextLine();
            questions[i].setAnswer1(something);
            System.out.print("Import answer B: ");
            something = sc.nextLine();
            questions[i].setAnswer2(something);
            System.out.print("Import answer C: ");
            something = sc.nextLine();
            questions[i].setAnswer3(something);
            System.out.print("Import answer D: ");
            something = sc.nextLine();
            questions[i].setAnswer4(something);
            System.out.print("Import right answer : ");
            c = sc.next().charAt(0);
            questions[i].setRightAnswer(c);
            System.out.print("Level of your question (Number): ");
            level = sc.nextInt();
            questions[i].setLevel(level);
        }
        QuestionManagement management= new QuestionManagement(questions);
        System.out.print("Level of questions you want (Number): ");
        level = sc.nextInt();
        int[] questionsLevel = management.questionLevel(level);
        for(int i:questionsLevel)
            System.out.println((i+1) + "." +questions[i].getContent());
        for(int i:questionsLevel)
        {
            System.out.println("Your answer for question " + (i+1) + ":");
            char c = sc.next().charAt(0);
            management.reply(i,c);
        }
        System.out.println("Number of right answers: " + management.point());
        for(int i:questionsLevel)
            System.out.println((i+1) + "." +questions[i].getRightAnswer());
    }
}
