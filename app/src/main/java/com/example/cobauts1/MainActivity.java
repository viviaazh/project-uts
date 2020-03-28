package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fullname, phonenumber, address, password, confirmpassword;
    Button register, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullname = findViewById(R.id.txt_fullname);
        phonenumber = findViewById(R.id.txt_phonenumber);
        address = findViewById(R.id.txt_address);
        password = findViewById(R.id.txt_password);
        confirmpassword = findViewById(R.id.txt_confirmpassword);
    }
}
