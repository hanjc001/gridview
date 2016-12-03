package com.example.a1027.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.gv);
        MyGridViewAdapter adapter = new MyGridViewAdapter(this.getApplicationContext());
        gv.setAdapter(adapter);

    }
}
