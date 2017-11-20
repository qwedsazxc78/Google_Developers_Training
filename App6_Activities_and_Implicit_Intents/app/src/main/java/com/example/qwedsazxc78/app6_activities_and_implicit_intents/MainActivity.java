package com.example.qwedsazxc78.app6_activities_and_implicit_intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doOption(View view) {
        switch (view.getId() ) {
            case R.id.buttonCall:
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+886920614661"));
                startActivity(i1);
                break;
            case R.id.buttonMap:
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" +
                        "25.105497, 121.597366"));
                startActivity(i2);
                break;
            case R.id.buttonWeb:
                Intent i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i3);
                break;

        }
    }
}
