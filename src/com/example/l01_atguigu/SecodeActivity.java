package com.example.l01_atguigu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class SecodeActivity extends Activity {

	private EditText et_secode_message ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secode);
		et_secode_message  = (EditText) findViewById(R.id.btn_secode_start1);
		String message = getIntent().getStringExtra("MESSAGE");
		et_secode_message.setText(message);
	}
}
