package com.kunal.weight_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        EditText text = findViewById(R.id.kilograms);
        TextView textView = findViewById(R.id.okk);
        TextView other = findViewById(R.id.pound);
        Button bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kilo = text.getText().toString();
                    int i = Integer.valueOf(kilo);
                    double pounds = i*2.2;
                    String output = Double.toString(pounds);
                    other.setText(output);
            }

        });
    }
}