package com.example.jeevi.up;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
EditText editText;
EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText=findViewById(R.id.editText2);
        editText1=findViewById(R.id.editText4);
    }

    public void hoo(View view) {

        String mailsub=editText.getText().toString();
        String mailmsg=editText1.getText().toString();

        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{  "vjumapathy12@gmail.com"});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, mailsub);
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, mailmsg);


        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent,
                "Send email using..."));

      /*  try {
            startActivity(Intent.createChooser(emailIntent,
                    "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {

            Toast.makeText(getActivity(),
                    "No email clients installed.",
                    Toast.LENGTH_SHORT).show();
        }
*/
    }


    public void bbb(View view) {
        Intent g=new Intent(Main3Activity.this,home.class);
       // g.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(g);
    }
}
