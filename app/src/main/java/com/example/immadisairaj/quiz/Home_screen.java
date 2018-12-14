package com.example.immadisairaj.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.immadisairaj.quiz.question.Question;

public class Home_screen extends AppCompatActivity  {
    Button start;
    Question q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        start=findViewById(R.id.home_start);
        start.setOnClickListener(onClickListener);
        ProgressBar progressBar=findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.VISIBLE);
        q=new Question(getApplicationContext());
        q.setQuestion();
        progressBar.setVisibility(View.GONE);

    }

    View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.home_start){
                Intent intent=new Intent(Home_screen.this,QuizActivity.class);
                intent.putExtra("question",q);
                startActivity(intent);
            }
        }
    };

}
