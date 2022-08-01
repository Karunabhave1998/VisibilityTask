package com.example.visibilitytask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1,l2;
    Button login,signup;
    View v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        v1 = findViewById(R.id.view1);
        v2 = findViewById(R.id.view2);

        login.setBackgroundColor(getResources().getColor(R.color.pink));
        signup.setBackgroundColor(getResources().getColor(R.color.grey));

        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login.setBackgroundColor(getResources().getColor(R.color.yellow));
                signup.setBackgroundColor(getResources().getColor(R.color.grey));

                login.setTextColor(getResources().getColor(R.color.black));
                signup.setTextColor(getResources().getColor(R.color.white));
                v1.setBackgroundColor(getResources().getColor(R.color.purple_700));

                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);
                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.GONE);


            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signup.setBackgroundColor(getResources().getColor(R.color.pink));
                login.setBackgroundColor(getResources().getColor(R.color.grey));

                signup.setTextColor(getResources().getColor(R.color.black));
                login.setTextColor(getResources().getColor(R.color.white));
                v2.setBackgroundColor(getResources().getColor(R.color.purple_700));

                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);
                v2.setVisibility(View.VISIBLE);
                v1.setVisibility(View.GONE);

            }
        });






    }
}