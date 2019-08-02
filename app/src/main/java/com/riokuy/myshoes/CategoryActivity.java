package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView adidas,converse,newbalance,nike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        adidas = (CardView) findViewById(R.id.adidas);
        converse = (CardView) findViewById(R.id.converse);
        newbalance = (CardView) findViewById(R.id.new_balance);
        nike = (CardView) findViewById(R.id.nike);

        adidas.setOnClickListener(this);
        converse.setOnClickListener(this);
        newbalance.setOnClickListener(this);
        nike.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent o;

        switch (v.getId()) {
            case R.id.adidas : o = new Intent(this, AdidasActivity.class);startActivity(o);break;
            case R.id.converse : o = new Intent(this, ConverseActivity.class);startActivity(o);break;
            case R.id.new_balance : o = new Intent(this, NewBalanceActivity.class);startActivity(o);break;
            case R.id.nike : o = new Intent(this, NikeActivity.class);startActivity(o);break;
            default:break;
        }
    }
}
