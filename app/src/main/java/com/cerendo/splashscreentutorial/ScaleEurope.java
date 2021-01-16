package com.cerendo.splashscreentutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScaleEurope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_europe);
    }

    public void onClickStartGoToMap(View view) {
        Intent intent = new Intent(ScaleEurope.this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(ScaleEurope.this, Dashboard.class);
        startActivity(intent);
    }

    public void onClickNext(View view) {
        Intent next_intent = new Intent(ScaleEurope.this, ScaleBerlin.class);
        startActivity(next_intent);
    }
}