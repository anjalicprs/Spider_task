package com.example.mypc.spiderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class Act1 extends AppCompatActivity {
    String[] dept = {"CSE", "ECE", "EEE","Chemical","Civil","ICE","Prod"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        dept);
        Spinner spinner =
                (Spinner)  findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
    }
    public void onClick(View view){
        final EditText carry =(EditText)findViewById(R.id.carry);
        final EditText editText2=(EditText)findViewById(R.id.editText2);
        String data1=editText2.getText().toString();
        String usermessage = carry.getText().toString();
        if(usermessage==null) {
            Toast.makeText(getBaseContext(), "PersonName is not filled", Toast.LENGTH_SHORT).show();
        }
        else if(data1==null) {
            Toast.makeText(getBaseContext(), "Roll No. is not filled", Toast.LENGTH_SHORT).show();
        }
        else{
        Intent i=new Intent(this,Respond.class);
        i.putExtra("message",usermessage);
        startActivity(i);}
   }
}
