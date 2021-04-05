package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText mht1, ht2;
    TextView htkq;
    Button bt1, bt2, bt3, bt4, kq12;
    String chua1, chua2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ánh sạ
        mht1 = findViewById(R.id.so1);
        ht2 = findViewById(R.id.so2);
        htkq = findViewById(R.id.kq);
        kq12 = findViewById(R.id.kq2);
        bt1 = findViewById(R.id.btcong);
        bt2 = findViewById(R.id.bttru);
        bt3 = findViewById(R.id.btnhan);
        bt4 = findViewById(R.id.btchia);

        htkq.setText("10+10=22");
        //toast
        //Toast.makeText(this,"thong bao ",Toast.LENGTH_LONG).show();




        //click
        kq12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "nhan roi", Toast.LENGTH_LONG).show();
                chua1 = mht1.getText().toString();
                chua2 = ht2.getText().toString();

                if (chua1.length() <= 0 || chua2.length() <= 0){
                    Toast.makeText(MainActivity.this, "chua nhap", Toast.LENGTH_LONG).show();
                    return;
                }


            }
        });

    }
}
