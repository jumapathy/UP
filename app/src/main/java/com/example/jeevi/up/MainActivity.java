package com.example.jeevi.up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView textView;
EditText ed1;

TextView textView1;
    EditText ed2;

TextView textView2;
EditText ed3;

    TextView textView3;
EditText ed4;
/*Spinner  spin;
ArrayList<String> arrayList;
ArrayAdapter<String> arrayAdapter;*/
    TextView textVie4;
    EditText ed5;

    TextView textView5;
    TextView textv;
    EditText ed6;
   /* Spinner spi;
ArrayList<String> arrayList1;
ArrayAdapter<String> arrayAdapter1;*/
//strings
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
  //  String o;
umapathy umapathy;

   Intent i ;
    Button bu1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView4);
        textView1=findViewById(R.id.textView7);
        textView2=findViewById(R.id.textView8);
        textView3=findViewById(R.id.textView9);
        textVie4=findViewById(R.id.textView10);
        textView5=findViewById(R.id.textView11);
        //textv=findViewById(R.id.textView2);
        /*-------------------------------------------------*/
        ed1=findViewById(R.id.editText3);//name
        ed2=findViewById(R.id.editText7);//location
        ed3=findViewById(R.id.editText5);//mobile
        ed4=findViewById(R.id.editText8);//PASSWORD
        ed5=findViewById(R.id.editText10);//age
        ed6=findViewById(R.id.editText11);//bloodgroup
        bu1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        umapathy=new umapathy(MainActivity.this);
      /*  spin=findViewById(R.id.spinner);//gender
        arrayList =new ArrayList<>();
        arrayList.add("MALE");
        arrayList.add("FEMALE");
        arrayList.add("Other");
        arrayAdapter=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList);
        spin.setAdapter(arrayAdapter);
       spin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    u=""+arrayList.get(position);
                    ed4.setText(u);
            }
        });
       spi=findViewById(R.id.spinner2);//bloodgroup
         arrayList1=new ArrayList<>();
        arrayList1.add("O+ve");
        arrayList1.add("O-ve");
        arrayList1.add("A+ve");
        arrayList1.add("A-ve");
        arrayList1.add("B+ve");
        arrayList1.add("AB+ve");
        arrayList1.add("AB-ve");
         arrayAdapter1=new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,arrayList1);
         spi.setAdapter(arrayAdapter1);
         spi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 m=""+arrayList1.get(position);
             }
         });*/


    }

    public void sss(View view) {
        a=ed1.getText().toString();
        b=ed2.getText().toString();
        c=ed3.getText().toString();
        d=ed4.getText().toString();
        e=ed5.getText().toString();
        f=ed6.getText().toString();
      long h= umapathy.saveit(a,b,c,d,e,f);
        Toast.makeText(this, "*Details SAVED*"+h+"\n"+"user name:"+a+"\n", Toast.LENGTH_SHORT).show();

    }

    public void gett(View view) {
      i=new Intent(MainActivity.this,Main2Activity.class);
       // c=ed2.getText().toString();
      // String z=umapathy.getuu(c);
       //  textv.setText(z);
        i.putExtra("um",a);
        i.putExtra("uma",b);
        i.putExtra("ump",c);
        i.putExtra("umpa",d);
        i.putExtra("umap",e);
        i.putExtra("ma",f);



        startActivity(i);


       /*Intent i=new Intent(MainActivity.this,Main2Activity.class);
       a=ed1.getText().toString();
        b=ed2.getText().toString();
        c=ed3.getText().toString();
        d=ed4.getText().toString();//password
        e=ed5.getText().toString();
        f=ed6.getText().toString();

        */
    }
}
