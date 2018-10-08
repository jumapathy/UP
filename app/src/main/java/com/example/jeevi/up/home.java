package com.example.jeevi.up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {
Intent u;
Intent j;
Intent k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void feed(View view) {
        //feedbak
      Intent k=new Intent(home.this,Main3Activity.class);
       // k.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
      startActivity(k);
    }

    public void log(View view) {
        //finalview
         u=new Intent(home.this,Main2Activity.class);
       // u.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(u);
    }

    public void sin(View view) {
        j=new Intent(home.this,MainActivity.class);
        //j.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(j);
    }

    public void abt(View view) {
        Intent l=new Intent(home.this,About.class);
        //l.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(l);
    }

    public void back(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
                 //   finish();
       // System.exit(1);

    }

    public void ply(View view) {
        Intent p=new Intent(home.this,tttActivity.class);
        startActivity(p);
    }
}
