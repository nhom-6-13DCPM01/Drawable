package com.example.drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.example.drawable.R.*;

public class UseBitmap extends AppCompatActivity {
    Button btn;
    ImageView image;
    boolean stage = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.use_bitmap);
        anhXa();
        clickImage();
    }
    public void anhXa(){
        btn= (Button) findViewById(id.button);
        image = (ImageView) findViewById(id.imageView);
    }

    public void setImage(){

        // Use BitMap---------------------
        /* if(stage){
            image.setImageResource(drawable.anh2);
        }else {
            image.setImageResource(drawable.anh);
        }*/

        // Use Vector---------------------
        /*image.setImageResource(drawable.ic_socicon_amazon);*/

        // Use Shape Custom---------------
        /*image.setImageResource(drawable.shape_cusstom);*/

        // Use layer_list------------------
       /* image.setImageResource(drawable.layer_list);*/

        // Use Level - list----------------
      /*  Random random = new Random();
        int number = random.nextInt(4);
        image.setImageLevel(number);*/

        //Use Transiton--------------------
        /*TransitionDrawable transitionDrawable = (TransitionDrawable) image.getDrawable();
        transitionDrawable.reverseTransition(2000);*/

    }

    public void clickImage(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setImage();
                stage = !stage;
            }
        });
    }
}