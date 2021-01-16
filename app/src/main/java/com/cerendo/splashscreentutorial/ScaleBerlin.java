package com.cerendo.splashscreentutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScaleBerlin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_berlin);
    }

    public void onClickStartGoToMap(View view) {
        Intent intent = new Intent(ScaleBerlin.this, MapsActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(ScaleBerlin.this, ScaleEurope.class);
        startActivity(intent);
    }

    public void onClickNext(View view) {
        Intent intent = new Intent(ScaleBerlin.this, Information.class);
        startActivity(intent);
    }

}