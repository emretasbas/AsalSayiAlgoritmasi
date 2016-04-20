package com.example.envy_m6.asalsayialgoritmasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    EditText et;
    int giris, sorgu, sayac, sonrakiAsal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        tv = (TextView)findViewById(R.id.textView);
        et = (EditText)findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                asalSorgu();
            }
        });
    }
    public void asalSorgu(){
        giris = Integer.parseInt(et.getText().toString());
        sorgu = giris;
        sayac = 0;
        for (int i=2; i<sorgu; i++){
            if (sorgu%i==0){
                sorgu++;
                sonrakiAsal = sorgu;
                sayac+=1;
                if (sorgu%i==0) {
                    break;
                }
            }
        }
        if (sorgu < 2){
            tv.setText("Asal Değil!");
        }
        else if (sayac==0){
            tv.setText(giris + " Sayısı Asaldır.");
        }
        else {
            tv.setText(giris + " Asal Değildir!\nBir sonraki asal sayı: " + sonrakiAsal);
        }
    }
}

