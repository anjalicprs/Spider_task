package com.example.mypc.spiderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class Respond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond);
        Bundle data = getIntent().getExtras();
        if(data==null)
        {
            return;
        }
        String message = data.getString("message");
        final TextView change =(TextView)findViewById(R.id.change);
        change.setText(message);
    }
    Long tsLong = System.currentTimeMillis()/1000;
    String ts = tsLong.toString();
    public void onClick(View view){
        Toast.makeText(getBaseContext(),ts,Toast.LENGTH_SHORT).show();//when u click back button Timestamp is displayed
        Intent i=new Intent(this,Act1.class);
        startActivity(i);
    }
}
