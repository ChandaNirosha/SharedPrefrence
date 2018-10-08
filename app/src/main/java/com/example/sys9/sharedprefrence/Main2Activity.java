package com.example.sys9.sharedprefrence;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(findViewById(R.id.txt1));
        t2=(findViewById(R.id.txt2));
        t3=(findViewById(R.id.txt3));
        SharedPreferences sharedPreferences=getSharedPreferences("prefs", Context.MODE_PRIVATE);
        String name=sharedPreferences.getString("NAME","");
        String college=sharedPreferences.getString("COLLEGE","");
        String branch=sharedPreferences.getString("BRANCH","");
        t1.setText(name);
        t2.setText(college);
        t3.setText(branch);

    }
}
