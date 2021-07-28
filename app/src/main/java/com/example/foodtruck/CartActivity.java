package com.example.foodtruck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    LinearLayout linear1,linear2,linear3,linear4,linear5,linear6;
     private TextView quan1,amount1,quan2,amount2,quan3,amount3,quan4,amount4,quan5,amount5,quan6,amount6,totalQuantity,totalAmount;
     Button checkoutButton;
     ImageButton trash1,trash2,trash3,trash4,trash5,trash6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Bundle bundle = getIntent().getExtras();
        int[] quantity = bundle.getIntArray("quantity");
        int amount[]=new int[quantity.length];

        linear1 = findViewById(R.id.linear1);
        quan1 = findViewById(R.id.quan1);
        amount1 = findViewById(R.id.amount1);
        quan2 = findViewById(R.id.quan2);
        amount2 = findViewById(R.id.amount2);
        quan3 = findViewById(R.id.quan3);
        amount3 = findViewById(R.id.amount3);
        quan4 = findViewById(R.id.quan4);
        amount4 = findViewById(R.id.amount4);
        quan5 = findViewById(R.id.quan5);
        amount5 = findViewById(R.id.amount5);
        quan6 = findViewById(R.id.quan6);
        amount6 = findViewById(R.id.amount6);
        totalQuantity=findViewById(R.id.totalQuantity);
        totalAmount=findViewById(R.id.totalAmount);
        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear4 = findViewById(R.id.linear4);
        linear5 = findViewById(R.id.linear5);
        linear6 = findViewById(R.id.linear6);
        checkoutButton=findViewById(R.id.checkoutButton);
        trash1=findViewById(R.id.trash1);
        trash2=findViewById(R.id.trash2);
        trash3=findViewById(R.id.trash3);
        trash4=findViewById(R.id.trash4);
        trash5=findViewById(R.id.trash5);
        trash6=findViewById(R.id.trash6);
        if (quantity[0] == 0)
        {
            linear1.setVisibility(View.GONE);
        }
        else {
            quan1.setText(String.valueOf(quantity[0]));
            amount[0]=quantity[0]*550;
            amount1.setText(String.valueOf(amount[0]));
        }
        if(quantity[1]==0)
        {
            linear2.setVisibility(View.GONE);
        }
        else {
            quan2.setText(String.valueOf(quantity[1]));
            amount[1]=quantity[1]*150;
            amount2.setText(String.valueOf(amount[1]));
        }
        if(quantity[2]==0)
        {
            linear3.setVisibility(View.GONE);
        }
        else {
            quan3.setText(String.valueOf(quantity[2]));
            amount[2]=quantity[2]*110;
            amount3.setText(String.valueOf(amount[2]));
        }
        if(quantity[3]==0)
        {
            linear4.setVisibility(View.GONE);
        }
        else {
            quan4.setText(String.valueOf(quantity[3]));
            amount[3]=quantity[3]*150;
            amount4.setText(String.valueOf(amount[3]));
        }
        if(quantity[4]==0)
        {
            linear5.setVisibility(View.GONE);
        }
        else {
            quan5.setText(String.valueOf(quantity[4]));
            amount[4]=quantity[4]*90;
            amount5.setText(String.valueOf(amount[4]));
        }
        if(quantity[5]==0)
        {
            linear6.setVisibility(View.GONE);
        }
        else {
            quan6.setText(String.valueOf(quantity[5]));
            amount[5]=quantity[5]*450;
            amount6.setText(String.valueOf(amount[5]));
        }
         reviseTotal(quantity,amount);


        checkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CartActivity.this, "Order placed", Toast.LENGTH_SHORT).show();
                onBackPressed();

            }
        });
        trash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear1.setVisibility(View.GONE);
                quantity[0]=0;
                amount[0]=0;
                reviseTotal(quantity,amount);
            }

        });
        trash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear2.setVisibility(View.GONE);
                quantity[1]=0;
                amount[1]=0;
                reviseTotal(quantity,amount);
            }
        });
        trash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear3.setVisibility(View.GONE);
                quantity[2]=0;
                amount[2]=0;
                reviseTotal(quantity,amount);
            }
        });
        trash4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear4.setVisibility(View.GONE);
                quantity[3]=0;
                amount[3]=0;
                reviseTotal(quantity,amount);
            }
        });
        trash5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear5.setVisibility(View.GONE);
                quantity[4]=0;
                amount[4]=0;
                reviseTotal(quantity,amount);
            }
        });
        trash6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear6.setVisibility(View.GONE);
                quantity[5]=0;
                amount[5]=0;
                reviseTotal(quantity,amount);
            }
        });
    }
    private  void reviseTotal(int quantity[],int amount[])
    {
        int total_quantity=0,total_amount=0;
        for(int i=0;i<quantity.length;i++)
        {
            total_quantity+=quantity[i];
            total_amount+=amount[i];
        }
        totalQuantity.setText(String.valueOf(total_quantity));
        totalAmount.setText(String.valueOf(total_amount));
    }



}