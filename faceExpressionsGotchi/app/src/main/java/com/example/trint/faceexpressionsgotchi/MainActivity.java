package com.example.trint.faceexpressionsgotchi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity{

    private ImageView mijkeStatus;
    private Button hungry;
    private Button sick;
    private Button bored;
    private Button mad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hungry =(Button) findViewById(R.id.hungry);
        sick =(Button) findViewById(R.id.sick);
        bored =(Button) findViewById(R.id.bored);
        mad =(Button) findViewById(R.id.mad);

        mijkeStatus =(ImageView) findViewById(R.id.mijke);
        mijkeStatus.setBackgroundResource(R.drawable.mijke_blij);

        hungry.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                mijkeStatus.setImageResource(0);
                mijkeStatus.setBackgroundResource(R.drawable.mijke_honger);
//                mijkeStatus.setBackground(R.drawable.mijke_honger);

            }
        });

        sick.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                mijkeStatus.setImageResource(0);
                mijkeStatus.setBackgroundResource(R.drawable.mijke_ziek);
//                mijkeStatus.setBackground(R.drawable.mijke_honger);

            }
        });

        bored.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                mijkeStatus.setImageResource(0);
                mijkeStatus.setBackgroundResource(R.drawable.mijke_bored);
//                mijkeStatus.setBackground(R.drawable.mijke_honger);

            }
        });

        mad.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                mijkeStatus.setImageResource(0);
                mijkeStatus.setBackgroundResource(R.drawable.mijke_boos);
//                mijkeStatus.setBackground(R.drawable.mijke_honger);

            }
        });

    }


//    public void onClick(View v)
//    {
//        switch(v.getId())
//        {
//            case R.id.imageView2:
//                imageView1.setImageResource(R.drawable.image2);
//                break;
//
//        }
//    }
}
