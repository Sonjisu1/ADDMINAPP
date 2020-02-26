package com.example.addminapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class QuestionList extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    ArrayList<QuestionData> list;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);


        Button questionbtn = (Button) findViewById(R.id.questionbtn) ;

        questionbtn.setOnClickListener(new View.OnClickListener() {   //작성하기 버튼 클릭 시
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Question.class);
                startActivity(intent);

            }
        });


       list = new ArrayList<>();


        RecyclerView recyclerView  = findViewById(R.id.questionRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        QuestionAdapter adapter = new QuestionAdapter(list);
        recyclerView.setAdapter(adapter);

    }
}
