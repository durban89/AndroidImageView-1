package com.gowhich.androidimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) this.findViewById(R.id.imageView1);


        imageView1.setLayoutParams(new LinearLayout.LayoutParams(200, 100));
        setTitle("height: " + imageView1.getLayoutParams().height + " Width: " + imageView1.getLayoutParams().width);
    }
}
