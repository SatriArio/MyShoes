package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class NikeActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView nikeair,nikeview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);
        nikeair = (CardView) findViewById(R.id.nike_air);
        nikeview = (CardView) findViewById(R.id.nike_view);

        nikeair.setOnClickListener(this);
        nikeview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent e;

        switch (v.getId()) {
            case R.id.nike_air : e = new Intent(this, NikeAirActivity.class);startActivity(e);break;
            case R.id.nike_view : e = new Intent(this, NikeViewActivity.class);startActivity(e);break;
            default:break;
        }
    }
}
