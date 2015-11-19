package com.example.nietyka.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    public void createMeme(String top, String bottom) {
        MiddleSectionFragment middleFragment = (MiddleSectionFragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        middleFragment.setMemeText(top, bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
