package com.app.utility;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;

public class surface extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
 
	 int re=0;
	@Override
  
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l_surface);
        
      
       
        ImageView v1=(ImageView)findViewById(R.id.imageView1);
        ImageView v2=(ImageView)findViewById(R.id.imageView2);
        v1.setOnClickListener(this);
        v2.setOnClickListener(this);
    }


	public void onClick(View v) {
		// TODO Auto-generated method stub
		String s=null,j=null;
		switch(v.getId())
		{
		case R.id.imageView1:		
			  EditText et=(EditText)findViewById(R.id.editText1);
		 	   String t=et.getText().toString();
		 	   

		        if(t.equals("1"))
		        {
		        	s="1";
		        }
		        else if(t.equals("2"))
		        {
		        		s="2";
		        }
		        else if(t.equals("3"))
		        {
		        	s="3";
		        }
		        else
		        {
		        	s="0";
		        }
			
		
		Bundle bundle = new Bundle();
	       bundle.putString("param1", s);

	       Intent myintent=new Intent();
			myintent.setClass(getApplicationContext(),surfaceView.class);
			myintent.putExtras(bundle);
			 startActivityForResult(myintent, 0);
			setResult(RESULT_OK, myintent);
		    finish();
				
			
			break;
		case R.id.imageView2:		
			  EditText et1=(EditText)findViewById(R.id.editText1);
		 	   String t2=et1.getText().toString();
		 	   

		        if(t2.equals("1"))
		        {
		        	j="1";
		        }
		        else if(t2.equals("2"))
		        {
		        		j="2";
		        }
		        else if(t2.equals("3"))
		        {
		        	j="3";
		        }
		        else
		        {
		        	j="0";
		        }
		
			
			
			Bundle bundle1 = new Bundle();
       bundle1.putString("param1", j);

       Intent myintent1=new Intent();
		myintent1.setClass(getApplicationContext(),surfaceView2.class);
		myintent1.putExtras(bundle1);
		 startActivityForResult(myintent1, 0);
		setResult(RESULT_OK, myintent1);
	    finish();
			
			
		
     		
			break;
			
		
			
	}
	}
}