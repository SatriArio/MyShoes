package com.riokuy.myshoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class ConverseActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView purcell,chuck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converse);
        purcell = (CardView) findViewById(R.id.converse_purcell);
        chuck = (CardView) findViewById(R.id.converse_chuck);

        purcell.setOnClickListener(this);
        chuck.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent c;

        switch (v.getId()) {
            case R.id.converse_purcell : c = new Intent(this, ConversePurcellActivity.class);startActivity(c);break;
            case R.id.converse_chuck : c = new Intent(this, ConverseChuckActivity.class);startActivity(c);break;
            default:break;
    }
}
}