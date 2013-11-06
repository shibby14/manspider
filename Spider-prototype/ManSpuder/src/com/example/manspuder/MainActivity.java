package com.example.manspuder;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity{

	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DrawView test = new DrawView(this);
        setContentView(test);
        
        final Handler handler=new Handler();
        final Runnable r = new Runnable()
        {
            public void run() 
            {
                handler.postDelayed(this, 25);
                test.update();
            }
        };

        handler.postDelayed(r, 25);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
