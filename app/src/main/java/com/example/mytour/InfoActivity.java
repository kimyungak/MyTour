package com.example.mytour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    int no = 0;
    int imgs[] = {R.drawable.info1, R.drawable.info2, R.drawable.info3, R.drawable.info4, R.drawable.info5};

    String txts[] = {"1번설명","2번설명","3번설명","4번설명","5번설명"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView img_info = findViewById(R.id.img_info);
        TextView txt_info = findViewById(R.id.txt_info);



        img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InfoActivity.this, "클릭", Toast.LENGTH_SHORT).show();
                no = ++no % 5;
                img_info.setImageResource(imgs[no]);
                txt_info.setText(txts[no]);
            }
        });
        findViewById(R.id.btn_info_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}