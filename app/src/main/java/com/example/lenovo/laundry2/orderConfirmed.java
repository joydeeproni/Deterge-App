package com.example.lenovo.laundry2;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class orderConfirmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmed);
        Bundle b1 = getIntent().getExtras();
    }


    public void gotoHome(View view) {
        Intent i=new Intent(this,UserPage.class);
        startActivity(i);
    }

    public void gotoHistory(View view) {
        Intent i=new Intent(this,History.class);
        startActivity(i);
    }
}
