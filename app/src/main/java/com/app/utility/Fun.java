package com.app.utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Fun extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_fun);
        ImageView v1=(ImageView)findViewById(R.id.imageView1);
      
        v1.setOnClickListener(this);
      
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.imageView1:						//maze
			Intent myintent1=new Intent();
     		myintent1.setClass(getApplicationContext(),Menu.class);
     		startActivity(myintent1);
     		
			break;
	
			
		
			
	}
}}