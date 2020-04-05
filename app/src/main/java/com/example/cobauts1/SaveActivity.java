package com.example.cobauts1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cobauts1.models.Transaction;

import static com.example.cobauts1.JoinClassActivity.INDEX_KEY;
import static com.example.cobauts1.JoinClassActivity.TRANSACTION_KEY;

public class SaveActivity extends AppCompatActivity {
    private EditText classInput;
    private EditText dayInput;
    private Transaction item;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        classInput = findViewById(R.id.input_class);
        dayInput = findViewById(R.id.input_day);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            item = extras.getParcelable(TRANSACTION_KEY);
            index = extras.getInt(INDEX_KEY, 0);
            classInput.setText(item.getClassSchedule());
            dayInput.setText(item.getDay());
        }
    }

    private boolean validasiInput(){
        if(TextUtils.isEmpty(classInput.getText())){
            Toast.makeText(this, "Please enter the class", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(TextUtils.isEmpty(dayInput.getText())){
            Toast.makeText(this, "Please enter the day", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void handleSubmit(View view) {
        if (validasiInput()){
            String classSchedule = classInput.getText().toString();
            String day = dayInput.getText().toString();

            item.setClassSchedule(classSchedule);
            item.setDay(day);

            Intent intent = new Intent();
            intent.putExtra(TRANSACTION_KEY, item);
            intent.putExtra(INDEX_KEY, index);
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
