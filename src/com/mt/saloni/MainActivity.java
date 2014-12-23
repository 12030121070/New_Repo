package com.mt.saloni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button click;
	private EditText name;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       click = (Button) findViewById(R.id.button1);
       name= (EditText) findViewById(R.id.editText1);
       
      
       
       OnClickListener listener = new OnClickListener() {
    	   
    	   @Override
    	   public void onClick(View v) {
    		   
    		   click.setText(name.getText());
    		   Toast.makeText(getApplicationContext(), name.getText(), Toast.LENGTH_LONG).show();
    	   }
       };
       
       

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

