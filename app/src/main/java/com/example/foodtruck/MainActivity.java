package com.example.foodtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submitButton,forgotButton,closeButton;
    TextView enterUsername,enterPassword;
    PopupWindow popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        submitButton=findViewById(R.id.submitButton);
        forgotButton=findViewById(R.id.forgotButton);
        enterUsername=findViewById(R.id.enterUsername);
        enterPassword=findViewById(R.id.enterPassword);
        
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enterUsername.getText().toString().isEmpty() || enterPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(enterUsername.getText().toString().trim().equals("admin") && enterPassword.getText().toString().trim().equals("admin"))
                    {
                        Toast.makeText(MainActivity.this, "User logged in", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity.this,com.example.foodtruck.MainPage.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Wrong username and password",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        forgotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View popView=layoutInflater.inflate(R.layout.popup,null);
                popup=new PopupWindow(popView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                popup.showAtLocation(popView, Gravity.CENTER,0,0);
                closeButton=popView.findViewById(R.id.closeButton);


               closeButton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       popup.dismiss();
                   }
               });
            }
        });
        
    }
}