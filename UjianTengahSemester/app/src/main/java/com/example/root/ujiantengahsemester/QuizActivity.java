package com.example.root.ujiantengahsemester;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    Button answer1, answer2, answer3, answer4, answer5;
    TextView pertanyaan, score ;

    private QuizActivity2 mquiz2 = new QuizActivity2();
    private String  mJawaban;
    private int mscore = 0;
   private int mquiz2length = mquiz2.mquiz2.length;

   Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        answer5 = (Button) findViewById(R.id.answer5);

        score = (TextView) findViewById(R.id.txtscore);
        pertanyaan = (TextView) findViewById(R.id.txtpertanyaan);

        updatequiz2(r.nextInt(mquiz2length));

        score.setText("Score :"+mscore);



        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText()== mJawaban){
                    mscore ++ ;
                    score.setText("Score:" +mscore);
                    updatequiz2(r.nextInt(mquiz2length));
                }else {
                    gameover();
                }

            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText()== mJawaban){
                    mscore ++ ;
                    score.setText("Score:" +mscore);
                    updatequiz2(r.nextInt(mquiz2length));
                }else {
                    gameover();
                }

            }


        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText()== mJawaban){
                    mscore ++ ;
                    score.setText("Score:" +mscore);
                    updatequiz2(r.nextInt(mquiz2length));
                }else {
                    gameover();
                }

            }

        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText()== mJawaban){
                    mscore ++ ;
                    score.setText("Score:" +mscore);
                    updatequiz2(r.nextInt(mquiz2length));
                }else {
                    gameover();
                }

            }

        });
        answer5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer5.getText()== mJawaban){
                    mscore ++ ;
                    score.setText("Score:" +mscore);
                    updatequiz2(r.nextInt(mquiz2length));
                }else {
                    gameover();
                }

            }

        });
    }
    private void updatequiz2(int num){
        pertanyaan.setText(mquiz2.getQuiz2(num));
        answer1.setText(mquiz2.getJawaban1(num));
        answer2.setText(mquiz2.getJawaban2(num));
        answer3.setText(mquiz2.getJawaban3(num));
        answer4.setText(mquiz2.getJawaban4(num));
        answer5.setText(mquiz2.getJawaban5(num));

        mJawaban = mquiz2.getJawabantrue(num);
    }
    private void gameover(){
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(QuizActivity.this);
        alertdialogbuilder.setMessage("Game Over ! Your Score is " +mscore+"points")
                .setCancelable(false)
                .setPositiveButton("Save Score", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),HighScoreSave.class));
                    }
                })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity((new Intent(getApplicationContext(),MainActivity.class)));
                            }
                        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();
    }
}
