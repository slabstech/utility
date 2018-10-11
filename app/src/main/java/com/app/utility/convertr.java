package com.app.utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class convertr extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.converter);
        Button b1=(Button) findViewById(R.id.widget45);
        Button b2=(Button) findViewById(R.id.widget42);
        Button b3=(Button) findViewById(R.id.widget37);
        Button b4=(Button) findViewById(R.id.widget44);
        Button b5=(Button) findViewById(R.id.widget43);
        Button b6=(Button) findViewById(R.id.widget38);
            b1.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_temperature.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b2.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_weight.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b3.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_energy.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b4.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_volume.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b5.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_power.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b6.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),converter_length.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
    }
}