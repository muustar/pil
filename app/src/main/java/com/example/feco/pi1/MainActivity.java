package com.example.feco.pi1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Integer num = 0;

    public MainActivity() throws MalformedURLException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* public void changeColor(View view){
        textView = (TextView) (findViewById(R.id.tv));
        if (num == 0){
            textView.setTextColor(Color.parseColor("#FF0000"));
            num=1;
        }else{
            textView.setTextColor(Color.parseColor("#0000FF"));
            num =0;
        }

    }*/


     HttpURLConnection connection;

    URL url = new URL("fgd");
     =





    public void httpRq(View v){

   }
}
