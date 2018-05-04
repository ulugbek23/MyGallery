package com.example.candi.mygallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Intent intent = getIntent();
        int id = intent.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[id]);

    }
}
