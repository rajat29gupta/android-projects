package com.example.basicagefactor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class SixActivity extends Activity {
int prev_val;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_six);
		prev_val=getIntent().getExtras().getInt("bvc");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_six, menu);
		return true;
	}
	public void YesEvent(View x)
    {
    	Intent myIntent=new Intent(getApplicationContext(),SevenActivity.class);
    	myIntent.putExtra("bvc", 32+prev_val);
    	startActivity(myIntent);
     }
	public void NoEvent(View x)
    {
    	Intent myIntent=new Intent(getApplicationContext(),SevenActivity.class);
    	myIntent.putExtra("bvc", prev_val);
    	startActivity(myIntent);
     }

}
