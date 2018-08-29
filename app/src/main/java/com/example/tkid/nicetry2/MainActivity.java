package com.example.tkid.nicetry2;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView, imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);


        Picasso.get().load("https://scontent.fhel3-1.fna.fbcdn.net/v/t1.0-9/37500605_1840208166073167_4423592173421723648_n.jpg?_nc_cat=0&oh=55fbf27390adcab6548c4518b98d13f6&oe=5BF8DBBB")
                .resize(1000,1000)
                .centerCrop()
                .into(imageView);
        Picasso.get().load("https://scontent.fhel3-1.fna.fbcdn.net/v/t1.0-9/39148902_1840215512739099_3928354007214456832_n.jpg?_nc_cat=0&oh=1382974fb32141de43681e016b3be909&oe=5C3364F0")
                .resize(1000,1000)
                .centerCrop()
                .into(imageView1);
        Picasso.get().load("https://scontent.fhel3-1.fna.fbcdn.net/v/t1.0-9/39139178_1840207702739880_9176458654541414400_n.jpg?_nc_cat=0&oh=3863697c3c19c26ae4c6362edfe0b1df&oe=5BEFA8DD")
                .resize(1000,1000)
                .centerCrop()
                .into(imageView2);
        Picasso.get().load("https://scontent.fhel3-1.fna.fbcdn.net/v/t1.0-9/39139178_1840207702739880_9176458654541414400_n.jpg?_nc_cat=0&oh=3863697c3c19c26ae4c6362edfe0b1df&oe=5BEFA8DD")
                .resize(1000,1000)
                .centerCrop()
                .into(imageView3);
        Picasso.get().load("https://scontent.fhel3-1.fna.fbcdn.net/v/t1.0-9/39052588_1840208546073129_4262377376215728128_n.jpg?_nc_cat=0&oh=ae4640ba9a929f151f2ec56fd09145cc&oe=5C39D63E")
                .resize(1000,1000)
                .centerCrop()
                .into(imageView4);
    }

}
