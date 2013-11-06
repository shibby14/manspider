package com.example.manspider;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

		//private Handler handler = new Handler();	
	private final View test = new View(this);
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
//        drawView.setBackgroundColor(Color.WHITE);
//        setContentView(drawView);
        
        //handler.post(timedTask);
        
        /*(R.layout.activity_main);
        
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v);
            }
        });*/

    }
    
    /*private Runnable timedTask = new Runnable(){
    	@Override
    	public void run() {
    		// TODO Auto-generated method stub
    		        			
    			drawView.incrTime();
    			handler.postDelayed(timedTask, 100);
    			
    	}
    };*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void sendMessage(View view) {
        Button b = (Button) view;
        b.setText("TEAG");
    }



	
    
}
