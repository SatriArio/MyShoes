package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class AdidasActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView boost,rize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);
        boost = (CardView) findViewById(R.id.adidas_boost);
        rize = (CardView) findViewById(R.id.adidas_rize);

        boost.setOnClickListener(this);
        rize.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent a;

        switch (v.getId()) {
            case R.id.adidas_boost : a = new Intent(this, AdidasBoostActivity.class);startActivity(a);break;
            case R.id.adidas_rize : a = new Intent(this, AdidasRizeActivity.class);startActivity(a);break;
            default:break;
        }
    }
}
