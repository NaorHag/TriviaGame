package TriviaGame;
//כרגע לא נעשה שימוש במחלקה הנל ויש צורך בכך!

public class Question {

    private static final String[] Questions = {"How many stars there are in the flag of the USA?", "What is the capital city of ISrael?", "How many letters there are in the english language?", "How many grams there are in 1 kilogram has?", "What are the three primary colors?"};
    private static final String[] Answers = {"25", "36", "51", "60", "Tel-Aviv", "Jerusalem", "Eilat", "Hebron", "20", "18", "22", "26", "100", "500", "1000", "10", "Yellow,Red,Blue", "Green,Yellow,Red", "Red,Green,Blue", "None of the answer"};
    private static final int[] correctAnswers = {3, 2, 4, 3, 3};

    public int numberQues = 0;
    static int i = 0;
    private String questionString;
    private String[] answers;
    private int rightAnswer;
    private int points;
//    private boolean shown = false;
    private int level;

    public String getQuestionString() {
        return questionString;
    }

    public void setQuestionString(String question) {
        this.questionString = question;
    }

    public String[] getAnswers() {
        for (int i = 0; i < 4; i++)
            return answers;
        return answers;
    }

    public void setAnswers(String[] answers) {
        String[] temp = new String[4];
        for (int i = 0, h = 0; i < 5; i++, h += 4) {
            for (int j = h, k = 0; j < (h + 4); j++, k++) {
                temp[k] = Answers[j];
            }
//        for (int j = i, k = 0; j < (i + 4); j++, k++,i++) {
//            temp[k] = answers[j];
//        }
            this.answers = temp;
        }
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return ++numberQues + ") " + questionString + "? (" + points + ")" + "\n" + getAnswers();
    }

    public Question() {
//        for (int i = 0; i < Questions.length; i++) {
//            newObject = 
//    }
        creatQuestionObject(Questions[i], Answers, points, rightAnswer);
    }

    public void creatQuestionObject(String question, String[] answers, int points, int rightAnswer) {
        setQuestionString(question);
        setAnswers(answers);
        setPoints(points);
        setRightAnswer(rightAnswer);
    }

}
