package com.andrey.igor.guess_bot.lastActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.andrey.igor.guess_bot.MainActivity;
import com.andrey.igor.guess_bot.R;

public class FinishActivity extends AppCompatActivity {

    int finish;

    ImageView finishPhoto;

    TextView finishText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        finishPhoto = (ImageView) findViewById(R.id.finishPhoto);

        finishText = (TextView) findViewById(R.id.finishText);

        finish = getIntent().getIntExtra("finish", 0);

        generate();
    }

    public void startAgain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void generate() {

        switch (finish) {
            //name
            case 6:
                finishPhoto.setImageResource(R.drawable.avdeev1);
                finishText.setText("Твій персонаж name");
                break;
            case 7:
                finishPhoto.setImageResource(R.drawable.avdeev2);
                finishText.setText("Твій персонаж name");
                break;
            case 8:
                finishPhoto.setImageResource(R.drawable.avdeev3);
                finishText.setText("Твій персонаж name");
                break;
            case 9:
                finishPhoto.setImageResource(R.drawable.avdeev4);
                finishText.setText("Твій персонаж name");
                break;
            case 10:
                finishPhoto.setImageResource(R.drawable.avdeev5);
                finishText.setText("Твій персонаж name");
                break;
            //name
            case 11:finishPhoto.setImageResource(R.drawable.fran1);
                finishText.setText("Твій персонаж name");
                break;
            case 12:
                finishPhoto.setImageResource(R.drawable.fran2);
                finishText.setText("Твій персонаж name");
                break;
            case 13:
                finishPhoto.setImageResource(R.drawable.fran3);
                finishText.setText("Твій персонаж name");
                break;
            case 14:
                finishPhoto.setImageResource(R.drawable.fran4);
                finishText.setText("Твій персонаж name");
                break;
            case 15:
                finishPhoto.setImageResource(R.drawable.fran5);
                finishText.setText("Твій персонаж name");
                break;
            // name
            case 16:
                finishPhoto.setImageResource(R.drawable.muhailov1);
                finishText.setText("Твій персонаж name");
                break;
            case 17:
                finishPhoto.setImageResource(R.drawable.muhailov2);
                finishText.setText("Твій персонаж name");
                break;
            case 18:
                finishPhoto.setImageResource(R.drawable.muhailov3);
                finishText.setText("Твій персонаж name");
                break;
            case 19:
                finishPhoto.setImageResource(R.drawable.muhailov4);
                finishText.setText("Твій персонаж name");
                break;
            case 20:
                finishPhoto.setImageResource(R.drawable.muhailov5);
                finishText.setText("Твій персонаж name");
                break;
            // name
            case 21:
                finishPhoto.setImageResource(R.drawable.kamen1);
                finishText.setText("Твій персонаж name");
                break;
            case 22:
                finishPhoto.setImageResource(R.drawable.kamen2);
                finishText.setText("Твій персонаж name");
                break;
            case 23:
                finishPhoto.setImageResource(R.drawable.kamen3);
                finishText.setText("Твій персонаж name");
                break;
            case 24:
                finishPhoto.setImageResource(R.drawable.kamen4);
                finishText.setText("Твій персонаж name");
                break;
            case 25:
                finishPhoto.setImageResource(R.drawable.kamen5);
                finishText.setText("Твій персонаж name");
                break;
            // name
            case 26:
                finishPhoto.setImageResource(R.drawable.kanarskiy1);
                finishText.setText("Твій персонаж name");
                break;
            case 27:
                finishPhoto.setImageResource(R.drawable.kanarskiy2);
                finishText.setText("Твій персонаж name");
                break;
            case 28:
                finishPhoto.setImageResource(R.drawable.kanarskiy3);
                finishText.setText("Твій персонаж name");
                break;
            case 29:
                finishPhoto.setImageResource(R.drawable.kanarskiy4);
                finishText.setText("Твій персонаж name");
                break;
            case 30:
                finishPhoto.setImageResource(R.drawable.kanarskiy5);
                finishText.setText("Твій персонаж name");
                break;
            //name
            case 31:
                finishPhoto.setImageResource(R.drawable.chorovod1);
                finishText.setText("Твій персонаж name");
                break;
            case 32:
                finishPhoto.setImageResource(R.drawable.chorovod2);
                finishText.setText("Твій персонаж name");
                break;
            case 33:
                finishPhoto.setImageResource(R.drawable.chorovod3);
                finishText.setText("Твій персонаж name");
                break;
            case 34:
                finishPhoto.setImageResource(R.drawable.chorovod4);
                finishText.setText("Твій персонаж name");
                break;
            case 35:
                finishPhoto.setImageResource(R.drawable.chorovod5);
                finishText.setText("Твій персонаж name");
                break;
            // name
            case 36:
                finishPhoto.setImageResource(R.drawable.igor1);
                finishText.setText("Твій персонаж name");
                break;
            case 37:
                finishPhoto.setImageResource(R.drawable.igor2);
                finishText.setText("Твій персонаж name");
                break;
            case 38:
                finishPhoto.setImageResource(R.drawable.igor3);
                finishText.setText("Твій персонаж name");
                break;
            case 39:
                finishPhoto.setImageResource(R.drawable.igor4);
                finishText.setText("Твій персонаж name");
                break;
            case 40:
                finishPhoto.setImageResource(R.drawable.igor5);
                finishText.setText("Твій персонаж name");
                break;
            // name
            case 41:
                finishPhoto.setImageResource(R.drawable.mankish1);
                finishText.setText("Твій персонаж name");
                break;
            case 42:
                finishPhoto.setImageResource(R.drawable.mankish2);
                finishText.setText("Твій персонаж name");
                break;
            case 43:
                finishPhoto.setImageResource(R.drawable.mankish3);
                finishText.setText("Твій персонаж name");
                break;
            case 44:
                finishPhoto.setImageResource(R.drawable.mankish4);
                finishText.setText("Твій персонаж name");
                break;
            case 45:
                finishPhoto.setImageResource(R.drawable.mankish5);
                finishText.setText("Твій персонаж name");
                break;
        }
    }
}
