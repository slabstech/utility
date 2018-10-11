package com.app.utility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

public class surfaceView extends Activity implements OnTouchListener{
    /** Called when the activity is first created. */
   OurView v;
   Bitmap ball,blob;
   float x,y;
   int r,g,b;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getIntent().getExtras();
        String param1 = bundle.getString("param1");
        if(param1.equals("1"))
        {
        	r=255;
        	g=0;b=0;
        }else if(param1.equals("2"))
        {
        	g=255;
        	r=0;
        	b=0;
        }
        else  if(param1.equals("3"))
        {r=0;g=0;
        	b=255;
        }
        else  if(param1.equals("0"))
        {
        	r=150;
        	g=150;
        	b=10;
        }
        
        v=new OurView(this);
        v.setOnTouchListener(this);
        ball=BitmapFactory.decodeResource(getResources(), R.drawable.mazw);
        blob=BitmapFactory.decodeResource(getResources(), R.drawable.mazw);
        
        x=y=0;
        setContentView(v);
    }
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		v.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		v.resume();
	}

	public class OurView extends SurfaceView implements Runnable{

		Thread t=null;
		SurfaceHolder holder;
		boolean isItOk=false;
		
		public OurView(Context context) {
			super(context);
			holder=getHolder();
			//sprite = new Sprite(OurView.this,blob);
			
			// TODO Auto-generated constructor stub
		}

	
		@SuppressLint("WrongCall") public void run() {
			// TODO Auto-generated method stub
			while(isItOk==true)
			{
				
				if(!holder.getSurface().isValid())
				continue;									
				//x=x+1;  animation
				
				Canvas c=holder.lockCanvas();
	onDraw(c);
			holder.unlockCanvasAndPost(c);
			
		}}
	protected void	onDraw(Canvas canvas)
	{
		canvas.drawARGB(255, r,g,b); //background
		canvas.drawBitmap(ball, x,y,null);
	}
		public void pause(){
			isItOk=false;
			while(true)
			{
				try{
					t.join();
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				break;
			}
			t=null;
			
		}
		public void resume(){
			isItOk=true;
			t=new Thread(this);
			t.start();
		}
		
	}


	public boolean onTouch(View v, MotionEvent me) {
		// TODO Auto-generated method stub
	try {
		Thread.sleep(50);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	if((me.getY()==10 ) || (me.getX()==10))
	{
		Intent myintent=new Intent();
		myintent.setClass(getApplicationContext(),sample.class);
		startActivity(myintent);
	}
	
		switch(me.getAction())
		{
		case MotionEvent.ACTION_DOWN:
			x=me.getX();
			y=me.getY();
		break;
		
		case MotionEvent.ACTION_UP:
			x=me.getX();
			y=me.getY();
		break;
		
		case MotionEvent.ACTION_MOVE:
			x=me.getX();
			y=me.getY();
			break;
		}
		return true;
	}
}