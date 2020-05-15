package com.samoylenko.homework122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_back;
    private Button button_next;
    private TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_back = findViewById(R.id.button_back);
        button_next = findViewById(R.id.button_next);
        text_result = findViewById(R.id.textView);
        text_result.setText("http://myfile.org/" + random());

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //text_result.setText("http://myfile.org/" + random());
                startActivity(intent);
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public int random(){
        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        int random_number = a + (int) (Math.random() * b); // Генерация числа
        return random_number;
        //System.out.println("1-ое случайное число: " + random_number);
    }
}
