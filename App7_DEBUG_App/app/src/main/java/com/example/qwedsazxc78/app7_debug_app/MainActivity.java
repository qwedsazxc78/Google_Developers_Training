package com.example.qwedsazxc78.app7_debug_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView2);
    }


    public void doAdd(View view) {
        int a1 = Integer.parseInt(e1.getText().toString());
        int a2 = Integer.parseInt(e2.getText().toString());
        Log.i("MainActivity", "doAdd: 1");

        int result = a1 + a2;
        Log.i("MainActivity", "doAdd: 2");

        tv1.setText("" + result);
        Log.i("MainActivity", "doAdd: 3");
    }
}
