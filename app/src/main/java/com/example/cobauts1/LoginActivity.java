package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.cobauts1.MainActivity.PHONE_KEY;

public class LoginActivity extends AppCompatActivity {
    EditText phonenumberInput;
    EditText passwordInput;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phonenumberInput = findViewById(R.id.txt_phonenumber);
        passwordInput = findViewById(R.id.txt_password);

    }

    public void handleLogin(View view) {

        String phonenumber = phonenumberInput.getText().toString();
        String password = passwordInput.getText().toString();

        preferences = getSharedPreferences("UserInfo", MODE_PRIVATE);

        String registeredPhonenumber = preferences.getString(PHONE_KEY, phonenumber);
        String registeredPassword = preferences.getString("password", password);

        if(phonenumber.equals(registeredPhonenumber) && password.equals(registeredPassword)){
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Usename atau password salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void handleRegister(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
