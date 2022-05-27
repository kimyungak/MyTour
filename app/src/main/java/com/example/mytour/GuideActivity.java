package com.example.mytour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        findViewById(R.id.img_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(Intent.ACTION_VIEW);
                //       Uri.parse("https://www.naver.com");
                //              startActivity(intent);
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=경기"))
            }
        });
    }
}