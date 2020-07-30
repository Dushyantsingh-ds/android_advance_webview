package com.truthpower.arunbatt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton01,mButton02,mButton03,mButton04,mButton05;
    String[] urls=new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        mButton01=findViewById(R.id.button1);

        mButton02=findViewById(R.id.button2);

        mButton03=findViewById(R.id.button3);

      // urls[0]="http://www.sntype.com/";
        urls[0]="http://www.sntype.com";

        urls[1]="http://www.sntype.com/registration.aspx?UserId=2001";
        urls[2]="http://www.sntype.com/complaint.aspx?UserId=2001";


        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });
        mButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Intent intent=new Intent(getApplicationContext(),load_urls.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);
            }
        });

    }


}
