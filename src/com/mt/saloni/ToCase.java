package com.mt.saloni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class ToCase extends Activity {


	private Button click2;
	private Button click3;
	private EditText txt;
	private RadioGroup rgCase;
	private TextView txtString;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_to_case);
		
		 click2= (Button) findViewById(R.id.upCase);
	     click3= (Button) findViewById(R.id.loCase);
	     txt= (EditText) findViewById(R.id.text1);
	     rgCase = (RadioGroup) findViewById(R.id.radioGroup1);
	     txtString = (TextView) findViewById(R.id.text2);
	     
	     OnClickListener listener2 = new OnClickListener() {
	    	   
	    	   @Override
	    	   public void onClick(View v) {
	    		   txtString.setText(txt.getText().toString().toUpperCase());
	    	   }
	       };
	       
	       OnClickListener listener3 = new OnClickListener() {
	    	   
	    	   @Override
	    	   public void onClick(View v) {
	    		   txtString.setText(txt.getText().toString().toLowerCase());
	    	   }
	       };
	       
	       OnCheckedChangeListener listener = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				
				switch(checkedId){
				case R.id.tolocase:
					txtString.setText(txt.getText().toString().toLowerCase());
					break;
				case R.id.toupcase:
					txtString.setText(txt.getText().toString().toUpperCase());
					break;
				}
			}
		};
	       
		   rgCase.setOnCheckedChangeListener(listener);
	       click2.setOnClickListener(listener2);
	       click3.setOnClickListener(listener3);
	    }
	

}
