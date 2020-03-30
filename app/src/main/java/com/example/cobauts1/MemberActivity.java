package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MemberActivity extends AppCompatActivity {
   EditText nameInput;
   EditText memberClassInput;
   EditText sessionInput;
   EditText dayInput;
//   TextView info;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        nameInput = findViewById(R.id.txt_name);
        memberClassInput = findViewById(R.id.txt_class);
        sessionInput = findViewById(R.id.txt_session);
        dayInput = findViewById(R.id.txt_days);
//        info = findViewById(R.id.showinfo);

    }

    public void handleSubmit(View view) {
        preferences = getSharedPreferences("SHARE_PREF", MODE_PRIVATE);
        String name = nameInput.getText().toString();
        String memberClass = memberClassInput.getText().toString();
        String session = sessionInput.getText().toString();
        String day = dayInput.getText().toString();

        SharedPreferences.Editor editor= preferences.edit();
        editor.putString("NAME", name);
        editor.putString("CLASS", memberClass);
        editor.putString("SESSION", session);
        editor.putString("DAYS", day);
        editor.apply();
    }

    public void handleOrder(View view) {
        Intent intent = new Intent(this, ListOrderActivity.class);
        startActivity(intent);
//        String memberClass = preferences.getString("CLASS", "");
//        String session = preferences.getString("SESSION", "");
//        info.setText("Class : " + memberClass
//                        + "\nSession : " + session);
    }

//    public void saveData(){
//        SharedPreferences preferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
//        SharedPreferences.Editor editor = preferences.edit();
//
//        editor.putString(MEMBERCLASS, "memberClass");
//        editor.putString(SESSION, "session");
//        editor.commit();
//
//        Toast.makeText(this, "Data berhasil disimpan", Toast.LENGTH_SHORT).show();
//    }
//
//    public void loadData(){
//        SharedPreferences preferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
//        memberclass = preferences.getString(MEMBERCLASS, "");
//        sessionclass = preferences.getString(SESSION, "");
//    }
//
//    public void updateViews(){
//        memberClassInput.setText(memberclass);
//        sessionInput.setText(sessionclass);
//    }

}