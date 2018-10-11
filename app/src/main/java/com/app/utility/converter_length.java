package com.app.utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class converter_length extends Activity {
	private EditText text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.length_converter);
		text = (EditText) findViewById(R.id.editText1);

	}

	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			RadioButton meterButton = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton footButton = (RadioButton) findViewById(R.id.radioButton2);
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number",
						Toast.LENGTH_LONG).show();
				return;
			}

			float inputValue = Float.parseFloat(text.getText().toString());
			if (meterButton.isChecked()) {
				text.setText(String
						.valueOf(convertFootToMeter(inputValue)));
			} else {
				text.setText(String
						.valueOf(convertMeterToFoot(inputValue)));
			}
			// Switch to the other button
			if (footButton.isChecked()) {
				footButton.setChecked(false);
				meterButton.setChecked(true);
			} else {
				footButton.setChecked(true);
				meterButton.setChecked(false);
			}
			break;
		}
	}

	// Converts to celsius
	private float convertFootToMeter(float foot) {
		return (foot*1250/381);
	}

	// Converts to fahrenheit
	private float convertMeterToFoot(float meter) {
		return (meter * 381/1250);
	}
}