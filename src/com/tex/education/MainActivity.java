package com.tex.education;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Vibrator vibe;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        
        Button create_button = (Button)findViewById(R.id.create_votation_button);
        create_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(MainActivity.this, Create.class);
				MainActivity.this.startActivity(myIntent);
				//vibrate();
			}
		});
        
        Button join_button = (Button)findViewById(R.id.join_votation_button);
        join_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(MainActivity.this, Join.class);
				MainActivity.this.startActivity(myIntent);
				//vibrate();
			}
		});
        
        Button settings_button = (Button)findViewById(R.id.menu_settings);
        settings_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(MainActivity.this, Settings.class);
				MainActivity.this.startActivity(myIntent);
				//vibrate();
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /**
     * Hace vibrar el telefono durante 95 ms
     */
    public void vibrate(){
		vibe.vibrate(95);
	}
}
