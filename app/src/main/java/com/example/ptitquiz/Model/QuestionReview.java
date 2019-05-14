package com.example.ptitquiz.Model;

import java.io.Serializable;

public class QuestionReview implements Serializable {
    private String question, ans1, ans2, ans3,ans4,answer,goiy;

    public QuestionReview() {
    }

    public QuestionReview(String question, String ans1, String ans2, String ans3, String ans4, String answer, String goiy) {
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.answer = answer;
        this.goiy = goiy;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGoiy() {
        return goiy;
    }

    public void setGoiy(String goiy) {
        this.goiy = goiy;
    }
}
