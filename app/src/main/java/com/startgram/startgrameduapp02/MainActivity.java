package com.startgram.startgrameduapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_first;
    Button btn_second;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);

        btn_first = findViewById(R.id.btn_first);
        btn_first.setOnClickListener(view -> {
            //Здесь будет код разметки события

            //В случае успешной отправки - обработать
            title.setText("Событие отправлено");
        });

        btn_second = findViewById(R.id.btn_second);
        btn_second.setOnClickListener(view -> {
            //Здесь будет код разметки события

            //В случае успешной отправки - обработать
            title.setText("Событие отправлено");
        });
    }
}