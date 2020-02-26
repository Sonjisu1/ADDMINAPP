package com.example.addminapp;

public class Users {

   public String title;     //제목
    public String writer;     //작성자
    public String answer;  //답변여부
    public String contents; //내용

    public Users(){

    }

    public Users(String title,String writer,String answer,String contents){

        this.title = title;
        this.writer =writer;
        this.answer=answer;
        this.contents = contents;
    }

}
