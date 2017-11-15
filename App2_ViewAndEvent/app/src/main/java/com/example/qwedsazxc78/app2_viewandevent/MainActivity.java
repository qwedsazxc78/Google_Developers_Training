package com.example.qwedsazxc78.app2_viewandevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//public class MainActivity extends AppCompatActivity implements View.OnClickListener{
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1  = (TextView) findViewById(R.id.t1);
        btn1 = (Button) findViewById(R.id.b1);
        btn1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        tv1.setText("you clicked button 1");
    }

    public void doSomething(View v) {
        tv1.setText("you clicked button 2");
    }
}
