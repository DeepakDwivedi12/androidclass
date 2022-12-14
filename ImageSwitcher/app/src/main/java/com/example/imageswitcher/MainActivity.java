package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher imgSw;
    Button previous,next;

    int[] image={R.drawable.arsenal,R.drawable.chelsea,R.drawable.liv,R.drawable.manutd};
    int position=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSw=findViewById(R.id.imgSw);
        previous=findViewById(R.id.btnPrevious);
        next=findViewById(R.id.btnNext);

        imgSw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imgVw=new ImageView(MainActivity.this);
                imgVw.setImageResource(image[position]);

                return imgVw;
            }
        });
        imgSw.setInAnimation(this, android.R.anim.slide_in_left);
        imgSw.setOutAnimation(this, android.R.anim.slide_out_right);
// setInAnimation & setOutAnimation is for animation while changing the image
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position>0){
                    position--;
                }else
                    if(position<0){
                        position=0;
                    }
                    imgSw.setImageResource(image[position]);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position<image.length)
                    position++;
                if(position>=image.length)
                    position= image.length-1;
                imgSw.setImageResource(image[position]);
            }
        });
    }
}