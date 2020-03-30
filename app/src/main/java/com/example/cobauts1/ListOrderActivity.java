package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ListOrderActivity extends AppCompatActivity {
    TextView listOrder;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_order);
        listOrder = findViewById(R.id.showinfo);

        preferences = getSharedPreferences("SHARE_PREF", MODE_PRIVATE);
        String name = preferences.getString("NAME", "");
        String memberClass = preferences.getString("CLASS", "");
        String session = preferences.getString("SESSION", "");
        String day = preferences.getString("DAYS", "");
        listOrder.setText("Name : " + name + "\nClass : " + memberClass
                + "\nSession : " + session + "\nDays : " + day);
    }
}
