package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fullnameInput, phonenumberInput, addressInput, passwordInput, confirmpasswordInput;
    Button register, cancel;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullnameInput = findViewById(R.id.txt_fullname);
        phonenumberInput = findViewById(R.id.txt_phonenumber);
        addressInput = findViewById(R.id.txt_address);
        passwordInput = findViewById(R.id.txt_password);
        confirmpasswordInput = findViewById(R.id.txt_confirmpassword);


    }


    public void handleRegister(View view) {
        preferences = getSharedPreferences("UserInfo", MODE_PRIVATE);
        String fullname = fullnameInput.getText().toString();
        String phonenumber = phonenumberInput.getText().toString();
        String address = addressInput.getText().toString();
        String password = passwordInput.getText().toString();
        String confirmpassword = confirmpasswordInput.getText().toString();

        if(fullnameInput.length()==0){
            fullnameInput.setError("Fullname harus diisi");
        }
        else if(phonenumber.length()==0){
            phonenumberInput.setError("Phone number harus diisi");
        }
        else if(addressInput.length()==0){
            addressInput.setError("Address harus diisi");
        }
        else if(passwordInput.length()==0){
            passwordInput.setError("Password harus diisi");
        }
        else if(confirmpassword.length()==0){
            confirmpasswordInput.setError("Confirm Password harus diisi");
        }
        else if(!password.equals(confirmpassword)){
            confirmpasswordInput.setError("Password tidak sama, silahkan ulangi");
        }
        else{
            SharedPreferences.Editor editor = preferences.edit();
//            editor.putString(phonenumber + password + "data", phonenumber + "/n" + fullname + address + confirmpassword);
            editor.putString("fullname", fullname);
            editor.putString("phonenumber", phonenumber);
            editor.putString("address", address);
            editor.putString("password", password);
            editor.putString("confirmpassword", confirmpassword);
            editor.commit();

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
//                    Toast.makeText(this, "Register Success!", Toast.LENGTH_SHORT).show();
        }
    }
}
