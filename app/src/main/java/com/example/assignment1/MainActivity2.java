package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView numofq;
    TextView q;
    Button A, B, C, D,next;
    int Result=0;
    int NumberOfQuestion = QuestionAnswer.question.length;
    int Index = 0;
    String Answer = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        numofq = findViewById(R.id.numofq);
        q = findViewById(R.id.q);
        A = findViewById(R.id.A);
        B = findViewById(R.id.B);
        C = findViewById(R.id.C);
        D = findViewById(R.id.D);
        next = findViewById(R.id.next);

        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        next.setOnClickListener(this);

        numofq.setText("Number Of The Question Is: "+numofq);

        GoToNext();

    }



    @Override
    public void onClick(View view) {
        A.setBackgroundColor(Color.GREEN);
        B.setBackgroundColor(Color.GREEN);
       C.setBackgroundColor(Color.GREEN);
        D.setBackgroundColor(Color.GREEN);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.next){
            if(Answer.equals(QuestionAnswer.correctAnswers[Index])){
                Result++;
            }
            Index++;
            GoToNext();


        }else{

            Answer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.GRAY);

    }
}
    void GoToNext(){

        if(Index == NumberOfQuestion ){
            finishQuiz();
            return;
        }

        numofq.setText(QuestionAnswer.question[Index]);
       A.setText(QuestionAnswer.choices[Index][0]);
        B.setText(QuestionAnswer.choices[Index][1]);
        C.setText(QuestionAnswer.choices[Index][2]);
        D.setText(QuestionAnswer.choices[Index][3]);

    }

    void finishQuiz(){
        String passStatus = "";
        if(Result > NumberOfQuestion*0.5){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Result is "+ Result+"  "+ NumberOfQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> reQuiz() )
                .setCancelable(false)
                .show();


    }

    void reQuiz(){
        Result = 0;
        Index =0;
        GoToNext();
    }
}