package com.sofia.example.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int currentImageIndex = 0;
    private int[] images={R.drawable.cachorro, R.drawable.gardem, R.drawable.happy, R.drawable.patinho, R.drawable.porquinho};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView4);
        imageView.setImageResource(images[currentImageIndex]);

        Button buttonNext = findViewById(R.id.button_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImageIndex++;
                if (currentImageIndex == images.length){
                    currentImageIndex = 0;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });

        Button buttonUntil = findViewById(R.id.button_until);
        buttonUntil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImageIndex--;
                if (currentImageIndex < 0){
                    currentImageIndex = images.length - 1;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });

        Button buttonHome = findViewById(R.id.button_home);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentImageIndex = 0;
                imageView.setImageResource(images[currentImageIndex]);
            }
        });
    }
}