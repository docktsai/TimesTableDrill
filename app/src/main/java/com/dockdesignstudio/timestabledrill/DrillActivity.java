package com.dockdesignstudio.timestabledrill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DrillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill);
        String question = "5X7 = ";
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(question);
    }
}
