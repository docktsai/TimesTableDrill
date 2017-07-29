package com.dockdesignstudio.timestabledrill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Integer number1=4;
        Integer number2=6;
        String question = number1.toString() + "X"+number2.toString();

        setContentView(R.layout.activity_main);
    }
}
