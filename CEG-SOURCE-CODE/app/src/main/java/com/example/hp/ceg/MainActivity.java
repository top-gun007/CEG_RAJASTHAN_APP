package com.example.hp.ceg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    String[] web = {
            "About\nCEG",
            "Authorized\nPartner",
            "Traning\nProgram's",
            "Placement",
            "Activities",
            "Enquiry",
            "    More...",
            "News\n&\nEvents",

    };
    int[] imageId = {
            R.drawable.header6,
            R.drawable.partners,
            R.drawable.train,
            R.drawable.tp,
            R.drawable.activities,
            R.drawable.enquire,
            R.drawable.more,
            R.drawable.newsicon
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.grid_single,web);

        Imageadapter imageadapter = new Imageadapter(MainActivity.this, web, imageId);
        grid = (GridView) findViewById(R.id.gridView);
        grid.setAdapter(imageadapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==0){
                    Intent intent = new Intent(MainActivity.this,about.class);
                    startActivity(intent);
                }
                else if  (position==1){
                    Intent intent = new Intent(MainActivity.this,Partners.class);
                    startActivity(intent);
                }else if(position==2){
                    Intent intent=new Intent(MainActivity.this,Regular_courses.class);
                    startActivity(intent);
                }else if (position==3){
                    Intent intent=new Intent(MainActivity.this,Activities.class);
                    startActivity(intent);
                }else if (position==4){
                    Intent intent=new Intent(MainActivity.this,Registration.class);
                    startActivity(intent);
                }else if (position==5){
                    Intent intent=new Intent(MainActivity.this,Placement.class);
                    startActivity(intent);
                }else if (position==6){
                    Intent intent=new Intent(MainActivity.this,  More.class);
                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent=new Intent(MainActivity.this,  news.class);
                    startActivity(intent);
                }
            }
        });


    }
}