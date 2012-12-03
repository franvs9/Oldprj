package com.tex.education;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Create extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_f1, menu);
        return true;
    }
}
