package com.example.l01_atguigu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private EditText et_main_message ;
	private Button btn_main_start1 ;
	private Button btn_main_start2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_main_message = (EditText) findViewById(R.id.et_main_message);
        btn_main_start1 = (Button) findViewById(R.id.btn_main_start1);
        btn_main_start2 = (Button) findViewById(R.id.btn_main_start2);
        
        btn_main_start1.setOnClickListener(this);
        btn_main_start2.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		if(btn_main_start1 == v){
			Intent intent = new Intent(this,SecodeActivity.class);
			intent.putExtra("MESSAGE", et_main_message.getText().toString());
			startActivity(intent);
		}else if(btn_main_start2 == v){
			
		}
	}
}
