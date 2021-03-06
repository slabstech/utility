package com.app.utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class converter_volume extends Activity {
	private EditText text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.volume_converter);
		text = (EditText) findViewById(R.id.editText1);

	}

	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			RadioButton ltButton = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton gaButton = (RadioButton) findViewById(R.id.radioButton2);
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number",
						Toast.LENGTH_LONG).show();
				return;
			}

			float inputValue = Float.parseFloat(text.getText().toString());
			if (ltButton.isChecked()) {
				text.setText(String
						.valueOf(convertGallonToLitre(inputValue)));
			} else {
				text.setText(String
						.valueOf(convertLitreToGallon(inputValue)));
			}
			// Switch to the other button
			if (gaButton.isChecked()) {
				gaButton.setChecked(false);
				ltButton.setChecked(true);
			} else {
				gaButton.setChecked(true);
				ltButton.setChecked(false);
			}
			break;
		}
	}
	
	// Converts to celsius
	private float convertLitreToGallon(float lt) {
		return (lt*.264172037f);
	}

	// Converts to fahrenheit
	private float convertGallonToLitre(float ga) {
		return (ga*3.785412f);
	}
}