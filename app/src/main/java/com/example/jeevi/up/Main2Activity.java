package com.example.jeevi.up;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  Main2Activity extends AppCompatActivity {
TextView textView;
TextView textView1;
//TextView t1;
  //  TextView t2;
    // TextView t3;
EditText editText1;
    String z;
    String z1;
    String z2;
    String z3,z4;
    String a;
String b;
String c;
String e;
String f;
String r;//get
umapathy umapathy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1=findViewById(R.id.textView);
       // t1=findViewById(R.id.eee1);
        //t2=findViewById(R.id.eee2);
        //t3=findViewById(R.id.eee3);
        textView=findViewById(R.id.eee);
        editText1=findViewById(R.id.editText);
        umapathy=new umapathy(Main2Activity.this);

    }

    public void uuu(View view) {
       // a=getIntent().getStringExtra("um");
        //b=getIntent().getStringExtra("uma");
       //c=getIntent().getStringExtra("ump");
        //e=getIntent().getStringExtra("umap");
        //f=getIntent().getStringExtra("ma");
        r=editText1.getText().toString();
         z1=umapathy.getuu(r);
         z2=umapathy.getuuu(r);
         z3=umapathy.getuuuu(r);
         z=umapathy.getu(r);
         z4=umapathy.getuv(r);
        textView.setText("location:"+z+"\n"+"Mobile_no:"+z1+"\n"+"Age:"+z2+"\n"+"BloodGroup:"+z3+"\n"+"Password:"+z4);
        //t1.setText();
        //t2.setText(z3);
       // t3.setText(z4);
    }

    public void fff(View view) {
        Intent j=new Intent(Main2Activity.this,home.class);
        startActivity(j);
    }

    public void ddd(View view) {
        /* public void DeleteContact(View view){
        userDbHelper=new UserDbHelper(getApplicationContext());
        sqLiteDatabase=userDbHelper.getReadableDatabase();
        userDbHelper.deleteinformation(search_name,sqLiteDatabase);
        Toast.makeText(getApplication(),"  Deleted contant",Toast.LENGTH_LONG).show();*/
       //umapathy=new umapathy(getApplicationContext());
       SQLiteDatabase p=umapathy.getReadableDatabase();
       umapathy.deletein(r,p);
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
    }
}
