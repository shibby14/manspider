package com.example.manspuder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View{

	
	Paint paint = new Paint();
	int posy = 0;
	public DrawView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	
	public void update(){
		
		posy = posy + 5;
		if (posy >= 480)
			posy = 0;
		
		postInvalidate();
	}
	
	protected void onDraw(Canvas canvas) {

		canvas.drawRect(30, posy, 60, posy + 30, paint);
	}
	
	

}
