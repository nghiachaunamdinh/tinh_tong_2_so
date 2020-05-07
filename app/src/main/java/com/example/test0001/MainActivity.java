package com.example.test0001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText exta,extb;
    private int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn_ab);
        exta=findViewById(R.id.edita);
        extb=findViewById(R.id.editb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!exta.getText().toString().isEmpty()&&!extb.getText().toString().isEmpty()){
                    a=Integer.parseInt(exta.getText().toString());
                    b=Integer.parseInt(extb.getText().toString());
                    Toast.makeText(MainActivity.this, "Gia tri "+a+" + "+b+" la : "+(a+b), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Nhap dung gia tri a va b", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
