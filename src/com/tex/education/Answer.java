package com.tex.education;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Answer extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_answer, menu);
        return true;
    }
}
