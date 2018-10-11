package com.app.utility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Gallery extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
   setContentView(R.layout.gallery);
    //    ImageView i=new ImageView(this);
    //  i.setImageResource(R.drawable.images0);
      
     
       Button b1=(Button) findViewById(R.id.button1);
       Button b2=(Button) findViewById(R.id.button2);
       Button b3=(Button) findViewById(R.id.button3);
       Button b4=(Button) findViewById(R.id.button4);
       Button b5=(Button) findViewById(R.id.button5);
      // b1.setText(R.drawable.images);
     //  b2.setText(R.drawable.images0);
    //   b3.setText(R.drawable.test_image);
       
       
    
 
      
       b1.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View arg0) 
    	  {String s="1";
    		   Bundle bundle = new Bundle();
          bundle.putString("param1", s);

          Intent myintent=new Intent();
   		myintent.setClass(getApplicationContext(),gallery_1.class);
   		myintent.putExtras(bundle);
   		 startActivityForResult(myintent, 0);
   		setResult(RESULT_OK, myintent);
   	    finish();

   		
    	  }
     
       }
            
       );
       b2.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View arg0) 
    	  {
    		   String s="2";
    		   Bundle bundle = new Bundle();
          bundle.putString("param1", s);

          Intent myintent=new Intent();
   		myintent.setClass(getApplicationContext(),gallery_1.class);
   		myintent.putExtras(bundle);
   		 startActivityForResult(myintent, 0);
   		setResult(RESULT_OK, myintent);
   	    finish();

    		
    	  }
     
       }
            
       );
       b3.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View arg0) 
    	  {
    		   String s="3";
    		   Bundle bundle = new Bundle();
          bundle.putString("param1", s);

          Intent myintent=new Intent();
   		myintent.setClass(getApplicationContext(),gallery_1.class);
   		myintent.putExtras(bundle);
   		 startActivityForResult(myintent, 0);
   		setResult(RESULT_OK, myintent);
   	    finish();

    	  }
     
       }
            
       );
       b4.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View arg0) 
    	  {String s="4";
    		   Bundle bundle = new Bundle();
          bundle.putString("param1", s);

          Intent myintent=new Intent();
   		myintent.setClass(getApplicationContext(),gallery_1.class);
   		myintent.putExtras(bundle);
   		 startActivityForResult(myintent, 0);
   		setResult(RESULT_OK, myintent);
   	    finish();

   		
    	  }
     
       }
            
       );
       b5.setOnClickListener(new OnClickListener()
       {
    	   public void onClick(View arg0) 
    	  {String s="5";
    		   Bundle bundle = new Bundle();
          bundle.putString("param1", s);

          Intent myintent=new Intent();
   		myintent.setClass(getApplicationContext(),gallery_1.class);
   		myintent.putExtras(bundle);
   		 startActivityForResult(myintent, 0);
   		setResult(RESULT_OK, myintent);
   	    finish();

   		
    	  }
     
       }
            
       );
       
    }
}