package com.andrey.igor.guess_bot.generalQuestionActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.andrey.igor.guess_bot.R;
import com.andrey.igor.guess_bot.lastActivity.OurActivity;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void btnYes(View view) {
        int map = 9;
        Intent intent = new Intent(this, OurActivity.class);
        intent.putExtra("map", map);
        startActivity(intent);
    }

    public void btnNo(View view) {
        int map = 10;
        Intent intent = new Intent(this, OurActivity.class);
        intent.putExtra("map", map);
        startActivity(intent);
    }
}
