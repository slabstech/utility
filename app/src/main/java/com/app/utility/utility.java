package com.app.utility;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class utility extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @SuppressLint("WrongViewCast") @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b1=(Button) findViewById(R.id.widget34);
        Button b2=(Button) findViewById(R.id.widget36);
        Button b3=(Button) findViewById(R.id.widget35);
        Button b4=(Button) findViewById(R.id.widget37);
        Button b5=(Button) findViewById(R.id.widget38);
        Button b6=(Button) findViewById(R.id.widget39);
        Button b7=(Button) findViewById(R.id.widget40);
        ImageView v=(ImageView)findViewById(R.id.imageView2);
     v.setOnClickListener(this);
        b1.setOnClickListener(new OnClickListener()
   {
	   public void onClick(View arg0) 
	  {
		  
		   Toast.makeText(utility.this,
					"LOADING CONVERTER", Toast.LENGTH_SHORT)
					.show();
		   try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Intent myintent=new Intent();
		myintent.setClass(getApplicationContext(),convertr.class);
		startActivity(myintent);
		
		
		
	  }
 
   }
        
   );

        b2.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg1) 
     	  {
     		   Toast.makeText(utility.this,
   					"LOADING CLOCK", Toast.LENGTH_SHORT)
   					.show();
   		   try {
   			Thread.sleep(1500);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
     		Intent my=new Intent();
     		my.setClass(getApplicationContext(),time.class);
     		startActivity(my);
     		
     	  }
      
        }
             
        );
    
        
  
    
        b4.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		  Toast.makeText(utility.this,
     					"LOADING IMAGE MOVER", Toast.LENGTH_SHORT)
     					.show();
     		   try {
     			Thread.sleep(1500);
     		} catch (InterruptedException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),surface.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b5.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		  Toast.makeText(utility.this,
     					"LOADING GALLERY", Toast.LENGTH_SHORT)
     					.show();
     		   try {
     			Thread.sleep(1500);
     		} catch (InterruptedException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),Gallery.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
        b6.setOnClickListener(new OnClickListener()
        {
     	   public void onClick(View arg0) 
     	  {
     		  Toast.makeText(utility.this,
     					"LOADING GAMES", Toast.LENGTH_SHORT)
     					.show();
     		   try {
     			Thread.sleep(1500);
     		} catch (InterruptedException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     		Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),Fun.class);
     		startActivity(myintent);
     		
     	  }
      
        }
             
        );
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.imageView2:
			Intent myintent=new Intent();
     		myintent.setClass(getApplicationContext(),i_utility.class);
     		startActivity(myintent);
     		
			break;
			
		}
		
	}
}