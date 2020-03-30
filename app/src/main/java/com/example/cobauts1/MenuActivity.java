package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    ImageView bgapp;
    ImageView clover;
    LinearLayout textsplash;
    LinearLayout menu;
    Animation frombottom;
    TextView displayinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SharedPreferences preferences = getSharedPreferences("UserInfo", MODE_PRIVATE);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bluebg);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.txtSplash);
        menu = (LinearLayout) findViewById(R.id.menu);

        bgapp.animate().translationY(-1900).setDuration(800).setStartDelay(300);
        clover.animate().alpha(0).setDuration(800).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(800).setStartDelay(300);

        menu.startAnimation(frombottom);
    }

    public void handleAllClass(View view) {
        Intent intent = new Intent(this, LayananActivity.class);
        startActivity(intent);
    }

    public void handleMember(View view) {
        Intent intent = new Intent(this, MemberActivity.class);
        startActivity(intent);
    }

    public void handleProfile(View view) {
    }
}
