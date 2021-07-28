package com.example.foodtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {
    ImageButton atc1,atc2,atc3,atc4,atc5,atc6,rem1,rem2,rem3,rem4,rem5,rem6;
    ImageButton cartButton;
    TextView quantity1,quantity2,quantity3,quantity4,quantity5,quantity6;
    private int quantity[]=new int[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        atc1 = findViewById(R.id.atc1);
        atc2 = findViewById(R.id.atc2);
        atc3 = findViewById(R.id.atc3);
        atc4 = findViewById(R.id.atc4);
        atc5 = findViewById(R.id.atc5);
        atc6 = findViewById(R.id.atc6);
        quantity1 = findViewById(R.id.quantity1);
        quantity2 = findViewById(R.id.quantity2);
        quantity3 = findViewById(R.id.quantity3);
        quantity4 = findViewById(R.id.quantity4);
        quantity5 = findViewById(R.id.quantity5);
        quantity6 = findViewById(R.id.quantity6);
        rem1 = findViewById(R.id.rem1);
        rem2 = findViewById(R.id.rem2);
        rem3 = findViewById(R.id.rem3);
        rem4 = findViewById(R.id.rem4);
        rem5 = findViewById(R.id.rem5);
        rem6 = findViewById(R.id.rem6);
        cartButton = findViewById(R.id.cartButton);
        atc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Italian margherita pizza added to the cart", Toast.LENGTH_SHORT).show();
                quantity[0]++;
                quantity1.setText("×" + quantity[0]);
            }
        });
        atc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Chicken nuggets added to the cart", Toast.LENGTH_SHORT).show();
                quantity[1]++;
                quantity2.setText("×" + quantity[1]);
            }
        });
        atc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Garlic Bread added to the cart", Toast.LENGTH_SHORT).show();
                quantity[2]++;
                quantity3.setText("×" + quantity[2]);
            }
        });
        atc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Chicken Biryani added to the cart", Toast.LENGTH_SHORT).show();
                quantity[3]++;
                quantity4.setText("×" + quantity[3]);
            }
        });
        atc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Chicken Wrap added to the cart", Toast.LENGTH_SHORT).show();
                quantity[4]++;
                quantity5.setText("×" + quantity[4]);
            }
        });
        atc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Mango CheeseCake added to the cart", Toast.LENGTH_SHORT).show();
                quantity[5]++;
                quantity6.setText("×" + quantity[5]);
            }
        });
        rem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[0] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[0]--;
                    quantity1.setText("×" + quantity[0]);
                }
            }
        });
        rem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[1] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[1]--;
                    quantity2.setText("×" + quantity[1]);
                }
            }
        });
        rem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[2] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[2]--;
                    quantity3.setText("×" + quantity[2]);
                }
            }
        });
        rem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[3] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[3]--;
                    quantity4.setText("×" + quantity[3]);
                }
            }
        });
        rem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[4] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[4]--;
                    quantity5.setText("×" + quantity[4]);
                }
            }
        });
        rem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantity[5] == 0) {
                    Toast.makeText(MainPage.this, "Empty field", Toast.LENGTH_SHORT).show();
                } else {
                    quantity[5]--;
                    quantity6.setText("×" + quantity[5]);
                }
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, com.example.foodtruck.CartActivity.class);
                intent.putExtra("quantity",quantity);
                startActivity(intent);
            }
        });

        if(quantity[0]==0)
        {
            quantity1.setText("×" + quantity[0]);
        }
        if(quantity[1]==0)
        {
            quantity2.setText("×" + quantity[1]);
        }
         if(quantity[2]==0)
        {
            quantity3.setText("×" + quantity[2]);
        }
        if(quantity[3]==0)
        {
            quantity4.setText("×" + quantity[3]);
        }
        if(quantity[4]==0)
        {
            quantity5.setText("×" + quantity[4]);
        }
        if(quantity[5]==0)
        {
            quantity6.setText("×" + quantity[5]);
        }

    }
}