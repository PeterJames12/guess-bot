package com.andrey.igor.guess_bot.lastActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.andrey.igor.guess_bot.R;
import com.andrey.igor.guess_bot.generalQuestionActivity.FifthActivity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OurActivity extends AppCompatActivity {

    private Map<Integer, String> mapGuy = new HashMap<>();
    private  Map<Integer, String> questionMap = new HashMap<>();
    TextView ourTextView;
    int global;
    int map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our);

        map = getIntent().getIntExtra("map", 0);

        ourTextView = (TextView) findViewById(R.id.ourTextView);

        createMapGuy(mapGuy);
        createMapQuestion(questionMap);

        generate();
    }
    public void btnNo(View v) {
        generate();
    }

    public void seePhoto(View v) {
        Intent intent = new Intent(this, FinishActivity.class);
        intent.putExtra("finish", global);
        startActivity(intent);
    }

    private void generate() {

        switch (map) {
            case 1:
                global = createQuestionForGuyWhoHasAGirl();
                break;
            case 2:
                global = createQuestionForGuyWhoDosentHasAGirl();
                break;
            case 3:
                global = LikesSport();
                break;
            case 4:
                global = DosentLikeSport();
                break;
            case 5:
                global = Programming();
                break;
            case 6:
                global = DontProgramming();
                break;
            case 7:
                global = LikesSeriars();
                break;
            case 8:
                global = DosentLikesSeriars();
                break;
            case 9:
                global = Smoke();
                break;
            case 10:
                global = DoNotSmoke();
                break;
        }
        ourTextView.setText(questionMap.get(global));
    }

    private int DoNotSmoke() {

        Random random = new Random();

        int number = 1 + random.nextInt(5);

        switch (number) {
            case 1:
                global = 26 + random.nextInt(10 - 5); // 26 - 30
                break;
            case 2:
                global = 21 + random.nextInt(10 - 5); // 21 - 25
                break;
            case 3:
                global = 36 + random.nextInt(10 - 5); // 36 - 40
                break;
            case 4:
                global = 41 + random.nextInt(10 - 5); // 41 - 45
                break;
            case 5:
                global = 31 + random.nextInt(10 - 5); // 31 - 35
        }
        return global;
    }

    private int Smoke() {

        Random random = new Random();

        int number = 1 + random.nextInt(3);

        switch (number) {
            case 1:
                global = 11 + random.nextInt(10 - 5); // 11 - 15
                break;
            case 2:
                global = 16 + random.nextInt(10 - 5); //16 - 20
                break;
            case 3:
                global = 6 + random.nextInt(10 - 5); // 6 - 10
                break;
        }
        return global;
    }

    private int DosentLikesSeriars() {

        Random random = new Random();

        int number = 1 + random.nextInt(3);

        switch (number) {
            case 1:
                global = 26 + random.nextInt(10 - 5); // 26 - 30
                break;
            case 2:
                global = 31 + random.nextInt(10 - 5); // 31 - 35
                break;
            case 3:
                global = 36 + random.nextInt(10 - 5); // 36 - 40
                break;
        }
        return global;
    }

    private int LikesSeriars() {

        Random random = new Random();

        int number = 1 + random.nextInt(5);

        switch (number) {
            case 1:
                global = 6 + random.nextInt(10 - 5); // 6 - 10
                break;
            case 2:
                global = 11 + random.nextInt(10 - 5); // 11 - 16
                break;
            case 3:
                global = 16 + random.nextInt(10 - 5); // 16 - 20
                break;
            case 4:
                global = 41 + random.nextInt(10 - 5); // 41 - 45
                break;
            case 5:
                global = 21 + random.nextInt(10 - 5); // 21 - 45
                break;
        }
        return global;
    }

    private int DontProgramming() {

        Random random = new Random();

        int number = 1 + random.nextInt(5);

        switch (number) {
            case 1:
                global = 6 + random.nextInt(10 - 5); // 6 - 10
                break;
            case 2:
                global = 11 + random.nextInt(10 - 5); // 11 - 16
                break;
            case 3:
                global = 16 + random.nextInt(10 - 5); // 16 - 20
                break;
            case 4:
                global = 21 + random.nextInt(10 - 5); // 21 - 45
                break;
            case 5:
                global = 26 + random.nextInt(10 - 5); // 26 - 45
                break;
        }
        return global;
    }

    private int Programming() {

        Random random = new Random();

        int number = 1 + random.nextInt(3);

        switch (number) {
            case 1:
                global = 41 + random.nextInt(10 - 5); // 41 - 45
                break;
            case 2:
                global = 31 + random.nextInt(10 - 5); // 31 - 35
                break;
            case 3:
                global = 36 + random.nextInt(10 - 5); // 36 - 40
                break;
        }
        return global;
    }

    private int DosentLikeSport() {

        Random random = new Random();

        int number = 1 + random.nextInt(4);

        switch (number) {
            case 1:
                global = 11 + random.nextInt(10 - 5); // 11 - 15
                break;
            case 2:
                global = 16 + random.nextInt(10 - 5); //16 - 20
                break;
            case 3:
                global = 6 + random.nextInt(10 - 5); // 6 - 10
                break;
            case 4:
                global = 26 + random.nextInt(10 - 5); // 26 - 30
                break;
        }
        return global;
    }

    private int LikesSport() {

        Random random = new Random();

        int number = 1 + random.nextInt(4);

        switch (number) {
            case 1:
                global = 41 + random.nextInt(10 - 5); // 41 - 45
                break;
            case 2:
                global = 31 + random.nextInt(10 - 5); // 31 - 35
                break;
            case 3:
                global = 36 + random.nextInt(10 - 5); // 36 - 40
                break;
            case 4:
                global = 21 + random.nextInt(10 - 5); // 21 - 25
                break;
        }
        return global;
    }

    private int createQuestionForGuyWhoDosentHasAGirl() {

        Random random = new Random();

        int number = 1 + random.nextInt(4);

        switch (number) {
            case 1:
                global = 6 + random.nextInt(10 - 5); // 6 - 10
                break;
            case 2:
                global = 21 + random.nextInt(10 - 5); // 21 - 25
                break;
            case 3:
                global = 36 + random.nextInt(10 - 5); // 36 - 40
                break;
            case 4:
                global = 41 + random.nextInt(10 - 5); // 41 - 45
                break;
        }
        return global;
    }

    private int createQuestionForGuyWhoHasAGirl() {

        Random random = new Random();

        int number = 1 + random.nextInt(4);

        switch (number) {
            case 1:
                global = 11 + random.nextInt(10 - 5); // 11 - 15
                break;
            case 2:
                global = 16 + random.nextInt(10 - 5); //16 - 20
                break;
            case 3:
                global = 26 + random.nextInt(10 - 5); // 26 - 30
                break;
            case 4:
                global = 31 + random.nextInt(10 - 5); // 31 - 35
                break;
        }
        return global;
    }

    private void createMapQuestion(Map<Integer, String> questionMap) {

//        name
    questionMap.put(6, "Твій персонаж тусовщик?");
    questionMap.put(7, "Твій персонаж фанат МЮ?");
    questionMap.put(8, "Твій персонаж вживав наркоту?");
    questionMap.put(9, "Твій персонаж дивиться наруто?");
    questionMap.put(10, "Твій персонаж підтягується два рази?");

//        name
    questionMap.put(11, "Твій персонаж любить мівіну, молодьожку і macСoffe?");
    questionMap.put(12, "Твій персонаж довго говорить по телефону?");
    questionMap.put(13, "Твій персонаж харашо гаваріт па рускі?");
    questionMap.put(14, "Твій персонаж любить охоту?");
    questionMap.put(15, "Твій персонаж крепко спить?");

//        name
    questionMap.put(16, "Твій персонаж низького зросту?");
    questionMap.put(17, "Твій персонаж носить жіночі кросівки?");
    questionMap.put(18, "Твій персонаж ставить ставки?");
    questionMap.put(19, "Твій персонаж спалився з телефоном?");
    questionMap.put(20, "Твій персонаж працював кур'єром?");

//        name
    questionMap.put(21, "Твій персонаж дивиться відяшки?");
    questionMap.put(22, "Твій персонаж обматується харчовою плівкою?");
    questionMap.put(23, "Твій персонаж любить заказувати вещі?");
    questionMap.put(24, "Твій персонаж слухає нігеський реп?");
    questionMap.put(25, "Твій персонаж фотошопить?");

//        name
    questionMap.put(26, "Твій персонаж займається бізнесом?");
    questionMap.put(27, "Твій персонаж бісить коли їсть Semki?");
    questionMap.put(28, "Твій персонаж продає книжки?");
    questionMap.put(29, "У твого персонажа росте воллося з вух?");
    questionMap.put(30, "Твій персонаж розказує цікаві історії?");

//        name
    questionMap.put(31, "Твій персонаж каже йдіть на сз?");
    questionMap.put(32, "Твій персонаж носить часи які не працюють?");
    questionMap.put(33, "Твій персонаж получає ***** на совещанії?");
    questionMap.put(34, "Через твого персонажа був огляд у всього курсу?");
    questionMap.put(35, "Твоєму персонажу легко налапшати (родичі приїхали)?");

//        name
    questionMap.put(36, "Твій персонаж бігає півмарафони?");
    questionMap.put(37, "Твій персонаж ходить на англійський?");
    questionMap.put(38, "Твій персонаж розказує спойлери?");
    questionMap.put(39, "Твій персонаж піксільні берци?");
    questionMap.put(40, "У твого персонажа стрижка як у Ранальда?");

//        name
    questionMap.put(41, "Твій персонаж любить комікси?");
    questionMap.put(42, "Твій персонаж прекрасно жартує?");
    questionMap.put(43, "Твій персонаж знає англійську краще за всіх?");
    questionMap.put(44, "Твій персонаж отравився ковбасками?");
    questionMap.put(45, "Твій персонаж займає чужі місця в аудиторії?");
}

    private void createMapGuy(Map<Integer, String> mapGuy) {
        mapGuy.put(1,"guy1");
        mapGuy.put(2,"guy2");
        mapGuy.put(3,"guy3");
        mapGuy.put(4,"guy4");
        mapGuy.put(5,"guy5");
        mapGuy.put(6,"guy6");
        mapGuy.put(7,"guy7");
        mapGuy.put(8,"guy8");
    }
}
