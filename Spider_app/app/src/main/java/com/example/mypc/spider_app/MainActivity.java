package com.example.mypc.spider_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private TextView text;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        text =(TextView) findViewById(R.id.textView);
        button.setOnClickListener(this);
    }
    private void Message(){
        i++;
        String s = text.getText().toString();
        String message = " "+i;
        text.setText(message);
    }


    @Override
    public void onClick(View v) {
        Message();
    }
}
