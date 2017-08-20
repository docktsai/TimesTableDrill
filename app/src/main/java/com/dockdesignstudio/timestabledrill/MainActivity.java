package com.dockdesignstudio.timestabledrill;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // call when start button tap
    public void runDrill(View view){
        // start times question
        Intent intent = new Intent(this,DrillActivity.class);
        startActivity(intent);
    }
}
