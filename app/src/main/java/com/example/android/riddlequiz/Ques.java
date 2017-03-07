package com.example.android.riddlequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;
import static com.example.android.riddlequiz.R.id.counter;
import static com.example.android.riddlequiz.R.id.edittext1;

public class Ques extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);
    }

    int no_of_questions_answered=0;
    public void one(View view){
        EditText edittext = (EditText) findViewById(R.id.edittext1);
        String edit_text = edittext.getText().toString();
        if (edit_text.equals("24")){
            no_of_questions_answered+=1;
        }
        displayCounter(no_of_questions_answered);
    }
    public void two(View view) {
        EditText edittext = (EditText) findViewById(R.id.edittext2);
        String edit_text = edittext.getText().toString();
        if (edit_text.equals("30") ) {
            no_of_questions_answered += 1;
        }
        displayCounter(no_of_questions_answered);
    }
    public void three(View view) {
        EditText edittext = (EditText) findViewById(R.id.edittext3);
        String edit_text = edittext.getText().toString();
        if (edit_text.equals("126") ) {
            no_of_questions_answered += 1;
        }
        displayCounter(no_of_questions_answered);
    }
    public void four(View view) {
        EditText edittext = (EditText) findViewById(R.id.edittext4);
        String edit_text = edittext.getText().toString();
        if (edit_text.equals("24")) {
            no_of_questions_answered += 1;
        }
        displayCounter(no_of_questions_answered);
    }
    public void  five(View view) {
        EditText edittext = (EditText) findViewById(R.id.edittext5);
        String edit_text = edittext.getText().toString();
        if (edit_text.equals("32")) {
            no_of_questions_answered += 1;
        }
        displayCounter(no_of_questions_answered);
    }
    public void result(View view){
        String results = "You answered following number of questions correctly...:";
        displayMessage(results);

    }
    private void displayMessage(String message) {
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(message);
    }
    private void displayCounter(int number) {
        TextView result = (TextView) findViewById(R.id.counter);
        result.setText(""+  number);
    }
}
