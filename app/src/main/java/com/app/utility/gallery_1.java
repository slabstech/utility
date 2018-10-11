package com.app.utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class gallery_1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       
        Bundle bundle = this.getIntent().getExtras();
        String param1 = bundle.getString("param1");
        if(param1.equals("1"))
        {
        	ImageView i=new ImageView(this);
            i.setImageResource(R.drawable.images0);
             
           setContentView(i);
        }
        else if(param1.equals("2"))
        {ImageView i=new ImageView(this);
         i.setImageResource(R.drawable.test_image);
          
        setContentView(i);
        }
        else if(param1.equals("3"))
        {
        	ImageView i=new ImageView(this);
            i.setImageResource(R.drawable.weight);
             
           setContentView(i);
        }
        else if(param1.equals("4"))
        {
        	ImageView i=new ImageView(this);
            i.setImageResource(R.drawable.paint);
             
           setContentView(i);
        }
        else if(param1.equals("5"))
        {
        	ImageView i=new ImageView(this);
            i.setImageResource(R.drawable.thermometer);
             
           setContentView(i);
        }
    }
}