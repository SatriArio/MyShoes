package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView search,news_feed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        search = (CardView) findViewById(R.id.search);
        news_feed = (CardView) findViewById(R.id.news_feed);
        // Add Click Listener to the next page
        search.setOnClickListener(this);
        news_feed.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.search : i = new Intent(this, CategoryActivity.class);startActivity(i);break;
            case R.id.news_feed : i = new Intent(this, NewsActivity.class);startActivity(i);break;
            default:break;
        }
    }
}
