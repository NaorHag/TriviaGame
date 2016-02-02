/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriviaGame;

import TriviaGameGUI.gameForm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class playGame {
    //יצירת המערכים שהם קבועים וסופיים לכל המשחק

    
//    private static final String[] Questions = {"How many stars there are in the flag of the USA?", "What is the capital city of ISrael?", "How many letters there are in the english language?", "How many grams there are in 1 kilogram has?", "What are the three primary colors?"};
//    private static final String[] Answers = {"25", "36", "51", "60", "Tel-Aviv", "Jerusalem", "Eilat", "Hebron", "20", "18", "22", "26", "100", "500", "1000", "10", "Yellow,Red,Blue", "Green,Yellow,Red", "Red,Green,Blue", "None of the answer"};
//    private static final int[] correctAnswers = {3, 2, 4, 3, 3};
    private static Question[] questionsList = {new Question(), new Question(), new Question(), new Question(), new Question()};
    boolean found = false;

    //בנאי שיוצר אוספים של שאלות ושל תשובות
    public playGame(int countQuestionsAnswers) {
//        List<String> questions = new ArrayList<String>(5);//אוסף של שאלות
//        List<String> answers = new ArrayList<String>(20);//אוסף של תשובות
//        List<String> questionShown = new ArrayList<String>(5);// אוסף השאלות שנשאלו
//        List<String> answerShown = new ArrayList<String>(20);//אוסף התשובות של השאלות שנשאלו
//        questions.addAll(Arrays.asList(Questions));
//        answers.addAll(Arrays.asList(Answers));
//        String[] answerArr = new String[4];
        
//        System.out.println("Sizeo f Questions is " + Questions.length);
//        System.out.println("Size of questions is " + questions.size());
//        for (int i = 0, h = 0; i < 5; i++, h += 4) {
//            Question tempQuestion = questionsList[i];
//            tempQuestion.setQuestionString(questions.get(i));
//            tempQuestion.setRightAnswer(correctAnswers[i]);
//
//            for (int j = h, k = 0; j < (h + 4); j++, k++) {
//                answerArr[k] = Answers[j];
//            }
//            tempQuestion.setAnswers(answerArr);
//            tempQuestion.setRightAnswer(correctAnswers[i]);
//            questionsList[i] = tempQuestion;
//            
//        }
        Random rmd = new Random();
        gameForm gf1;
        int randomNumber;

            if (countQuestionsAnswers > 0 && !(questions.isEmpty())) {
                int Low = 0;
                int High = 4;
                randomNumber = rmd.nextInt(High - Low) + Low;
                System.out.println(randomNumber);
                Question tempQ = questionsList[randomNumber];
                questionShown.add(questions.get(randomNumber));
                Iterator< String> iterator = questions.iterator();
                for (int i = 0; i <= 4; i++) {
                    if (questionShown.contains(iterator.next())) {
                        iterator.remove();
                    }
                }
                tempQ.setShown(true);
                countQuestionsAnswers -= 1;
                gf1 = new gameForm(tempQ, countQuestionsAnswers);
            }
        }
}
