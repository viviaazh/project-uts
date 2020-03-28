package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText phonenumber;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phonenumber = findViewById(R.id.txt_phonenumber);
        password = findViewById(R.id.txt_password);
    }

    public void handleLogin(View view) {
    }

    public void handleRegister(View view) {
    }
}
