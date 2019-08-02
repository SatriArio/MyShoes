package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class NewBalanceActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView nb1300,nb1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_balance);
        nb1300 = (CardView) findViewById(R.id.nw1300);
        nb1500 = (CardView) findViewById(R.id.nw1500);

        nb1300.setOnClickListener(this);
        nb1500.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent b;

        switch (v.getId()) {
            case R.id.nw1300 : b = new Intent(this, Balance1300Activity.class);startActivity(b);break;
            case R.id.nw1500 : b = new Intent(this, Balance1500Activity.class);startActivity(b);break;
            default:break;
        }
    }
}
