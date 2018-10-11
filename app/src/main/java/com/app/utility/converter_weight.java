package com.app.utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class converter_weight extends Activity {
	private EditText text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weight_converter);
		text = (EditText) findViewById(R.id.editText1);

	}

	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			RadioButton kgButton = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton poundButton = (RadioButton) findViewById(R.id.radioButton2);
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number",
						Toast.LENGTH_LONG).show();
				return;
			}

			float inputValue = Float.parseFloat(text.getText().toString());
			if (kgButton.isChecked()) {
				text.setText(String
						.valueOf(convertPoundToKg(inputValue)));
			} else {
				text.setText(String
						.valueOf(convertKgToPound(inputValue)));
			}
			// Switch to the other button
			if (poundButton.isChecked()) {
				poundButton.setChecked(false);
				kgButton.setChecked(true);
			} else {
				poundButton.setChecked(true);
				kgButton.setChecked(false);
			}
			break;
		}
	}
	
	// Converts to celsius
	private float convertPoundToKg(float pound) {
		return (pound*2.204622476f);
	}

	// Converts to fahrenheit
	private float convertKgToPound(float kg) {
		return (kg*0.4535924f);
	}
}