package com.example.dell.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question3 extends AppCompatActivity {
    RadioButton radioButton;
    RadioGroup radioGroup;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        radioGroup=(RadioGroup) findViewById(R.id.radiogroup3);
        textView=(TextView) findViewById(R.id.mytextview);
    }
    public void buttonthreeclick(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        TextView buttonmadrid=(TextView) findViewById(R.id.buttonmadrid);

        if(radioButton==buttonmadrid)
            textView.setText("Welldone: This is correct.");
        else
            textView.setText("Wrong! Try Again.");

    }
    public void checkbutton(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        Toast.makeText(this, "Option:" + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
    public void previousclick(View v){
        Intent i=new Intent(question3.this, question2.class);
        startActivity(i);
    }
    public void nextclick(View v){
        Intent i=new Intent(question3.this, question4.class);
        startActivity(i);
    }
}
