package com.example.democontentprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChiTietContacts extends AppCompatActivity {
    Button btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_contacts);
        Intent intent = getIntent();
        TextView tv = (TextView) findViewById(R.id.thongtin);
        tv.setText(intent.getStringExtra("Dulieu"));
        Button btBack = (Button) findViewById(R.id.back);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChiTietContacts.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}