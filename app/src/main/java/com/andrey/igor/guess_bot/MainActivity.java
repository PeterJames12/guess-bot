package com.andrey.igor.guess_bot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.andrey.igor.guess_bot.generalQuestionActivity.FifthActivity;
import com.andrey.igor.guess_bot.generalQuestionActivity.FirstActivity;
import com.andrey.igor.guess_bot.generalQuestionActivity.FourthActivity;
import com.andrey.igor.guess_bot.generalQuestionActivity.SecondActivity;
import com.andrey.igor.guess_bot.generalQuestionActivity.ThirdActivity;

import java.util.Random;

public class MainActivity extends Activity {

    Random mainActivityRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnYes(View v) {

        Intent intent;

        int activityRandom = 1 + mainActivityRandom.nextInt(5);

        switch (activityRandom) {
            case 1:
                intent = new Intent(this, FirstActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(this, FourthActivity.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(this, FifthActivity.class);
                startActivity(intent);
                break;
        }
    }
}


