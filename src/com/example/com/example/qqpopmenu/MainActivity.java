package com.example.com.example.qqpopmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
    private Button start;
    private FrameLayout first;
    private FrameLayout second;
    private Animation anim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		first = (FrameLayout) findViewById(R.id.first);
		second = (FrameLayout) findViewById(R.id.second);
		start = (Button) findViewById(R.id.start);
		anim = AnimationUtils.loadAnimation(this, R.anim.move_out);
		start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				second.startAnimation(anim);
				anim.setFillAfter(true);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
