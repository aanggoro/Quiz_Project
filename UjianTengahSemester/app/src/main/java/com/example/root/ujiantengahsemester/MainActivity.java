package com.example.root.ujiantengahsemester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button quiz, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        quiz = (Button) findViewById(R.id.btnplay);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });
        about = (Button) findViewById(R.id.btnabout);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AboutActivity.class );
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}
