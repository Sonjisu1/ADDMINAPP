package com.example.addminapp;

import android.widget.TextView;

public class QuestionData {
    String title;
    String writer;
    String number;
    String Answer;

    public QuestionData(){

    }

    public QuestionData(String number,String title,String writer,String answer){
        this.number =number;
        this.title= title;
        this.writer = writer;
        this.Answer =answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
