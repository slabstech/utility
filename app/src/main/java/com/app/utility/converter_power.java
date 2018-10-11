package com.app.utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class converter_power extends Activity {
	private EditText text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.power_converter);
		text = (EditText) findViewById(R.id.editText1);

	}

	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			RadioButton hpButton = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton kwButton = (RadioButton) findViewById(R.id.radioButton2);
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number",
						Toast.LENGTH_LONG).show();
				return;
			}

			float inputValue = Float.parseFloat(text.getText().toString());
			if (hpButton.isChecked()) {
				text.setText(String
						.valueOf(convertHpToKw(inputValue)));
			} else {
				text.setText(String
						.valueOf(convertKwToHp(inputValue)));
			}
			// Switch to the other button
			if (kwButton.isChecked()) {
				kwButton.setChecked(false);
				hpButton.setChecked(true);
			} else {
				kwButton.setChecked(true);
				hpButton.setChecked(false);
			}
			break;
		}
	}

	// Converts to celsius
	private float convertKwToHp(float kw) {
		return (kw*1.341021859f);
	}

	// Converts to fahrenheit
	private float convertHpToKw(float hp) {
		return (hp*.7457f);
	}
}