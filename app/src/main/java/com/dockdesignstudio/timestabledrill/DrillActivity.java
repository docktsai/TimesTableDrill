package com.dockdesignstudio.timestabledrill;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DrillActivity extends AppCompatActivity {

    Integer number1=4;
    Integer number2=6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill);

        String question = number1.toString() + "X"+number2.toString()+ " = ";
        TextView tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        tvQuestion.setText(question);
    }
    public void checkAnswer(View view){
        EditText etAnswer = (EditText) findViewById(R.id.etAnswer);
        TextView tvAnswer = (TextView) findViewById(R.id.tvAnswer);
        TextView tvChkResult = (TextView) findViewById(R.id.tvChkResult);

        String strAnswer = etAnswer.getText().toString();
        Integer answer = Integer.parseInt(strAnswer);
        tvAnswer.setText(strAnswer);

        if (answer == (number1*number2)){
            tvChkResult.setText("Correct!");
        } else {
            tvChkResult.setText("Wrong!");
        }
    }
}
