package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    EditText mht1,ht2;
    TextView htkq;
    Button bt1,bt2,bt3,bt4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ánh sạ
        mht1 = findViewById(R.id.so1);
        ht2 = findViewById(R.id.so2);
        htkq = findViewById(R.id.kq);
        bt1 = findViewById(R.id.btcong);
        bt2 = findViewById(R.id.bttru);
        bt3 =findViewById(R.id.btnhan);
        bt4 =findViewById(R.id.btchia);

        htkq.setText("10+10=22");
        //toast
        //Toast.makeText(this,"thong bao ",Toast.LENGTH_LONG).show();

        Log.d(TAG, "onCreate: ");
    }
}
