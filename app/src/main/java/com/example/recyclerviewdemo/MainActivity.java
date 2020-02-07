package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * RecyclerView 开发
 */
public class MainActivity extends AppCompatActivity {
    private Button mBtnLinear,mBtnHor,mBtnGrid,mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLinear = (Button)findViewById(R.id.btn_linear);
        mBtnHor = (Button)findViewById(R.id.btn_hor);
        mBtnGrid = (Button)findViewById(R.id.btn_grid);
        mBtnPu = (Button)findViewById(R.id.btn_pu);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}