package com.tex.education;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Create extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_create, menu);
        return true;
    }
}
