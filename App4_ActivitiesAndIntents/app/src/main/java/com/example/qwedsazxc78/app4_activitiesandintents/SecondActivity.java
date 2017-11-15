package com.example.qwedsazxc78.app4_activitiesandintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView) findViewById(R.id.textview_intent);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("user");
        tv.setText(s1);
    }
}
