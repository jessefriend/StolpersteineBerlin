package com.cerendo.splashscreentutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        String s= "HIER WOHNTE \nANITA FRANK \nJG. 1923 \n\n\nDEPORTIERT 16.6.1943 \n\nTHERESIENSTADT \n1944 AUSCHWITZ \nERMORDET APRIL 1945 \n\nBERGEN-BELSEN";
        SpannableString ss1=  new SpannableString(s);
        ss1.setSpan(new RelativeSizeSpan(2f), 13, 26, 0);
        TextView tv= (TextView) findViewById(R.id.textView1);
        tv.setText(ss1, TextView.BufferType.SPANNABLE);


    }

    public void onClickStartGoToMap(View view) {
        Intent intent = new Intent(Information.this, MapsActivity.class);
        startActivity(intent);
    }
    public void onClickBack(View view) {
        Intent intent = new Intent(Information.this, ScaleBerlin.class);
        startActivity(intent);
    }

}