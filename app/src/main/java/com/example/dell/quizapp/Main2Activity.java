package com.example.dell.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup=(RadioGroup) findViewById(R.id.radiogroup);
        textView=(TextView) findViewById(R.id.mytextview);


    }
    public  void buttononeclick(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        TextView buttonmessi=(TextView) findViewById(R.id.buttonmessi);

        if(radioButton==buttonmessi)
        textView.setText("Welldone: This is correct");
        else
            textView.setText("wrong. Try Again");

    }
    public void checkbutton(View v){
        int radioid=radioGroup.getCheckedRadioButtonId();
        radioButton=(RadioButton) findViewById(radioid);
        Toast.makeText(this, "Option:" + radioButton.getText(), Toast.LENGTH_SHORT ).show();

    }
    public void nextclick (View v){
        Intent i=new Intent(Main2Activity.this, question2.class);
        startActivity(i);
    }
}
