package com.example.dell.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class question2 extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        radioGroup=(RadioGroup) findViewById(R.id.radiogroup2);
        textView=(TextView) findViewById(R.id.mytextview);

    }
    public void buttontwoclick(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        TextView buttonitaly=(TextView) findViewById(R.id.buttonitaly);

        if(radioButton==buttonitaly)
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
        Intent i=new Intent(question2.this, Main2Activity.class);
        startActivity(i);
    }
    public void nextclick(View v){
        Intent i=new Intent(question2.this, question3.class);
        startActivity(i);
    }
}
