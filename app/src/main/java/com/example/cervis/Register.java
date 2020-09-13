package com.example.cervis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    public Button butSign;

    public void init(){
        butSign = (Button)findViewById(R.id.butSign);
        butSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIn = new Intent(Register.this, DetailsActivity2.class);
                startActivity(signIn);
            }
        });
    }

    public Button btnLogin;
    public void entlogin(){
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logi = new Intent(Register.this, Login.class);
                startActivity(logi);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
        entlogin();
    }
}