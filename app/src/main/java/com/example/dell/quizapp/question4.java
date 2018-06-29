package com.example.dell.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question4 extends AppCompatActivity {
    RadioButton radioButton;
    RadioGroup radioGroup;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        radioGroup=(RadioGroup) findViewById(R.id.radiogroup4);
        textView=(TextView) findViewById(R.id.mytextview);
    }
    public void buttonfourclick(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        TextView buttonrussia=(TextView) findViewById(R.id.buttonrussia);

        if(radioButton==buttonrussia)
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
        Intent i=new Intent(question4.this, question3.class);
        startActivity(i);
    }
    public void nextclick(View v){
        Intent i=new Intent(question4.this, last.class);
        startActivity(i);

    }
}
