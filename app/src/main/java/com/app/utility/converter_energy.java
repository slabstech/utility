package com.app.utility;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class converter_energy extends Activity {
	private EditText text;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.energy_converter);
		text = (EditText) findViewById(R.id.editText1);

	}

	// This method is called at button click because we assigned the name to the
	// "On Click property" of the button
	public void myClickHandler(View view) {
		switch (view.getId()) {
		case R.id.button1:
			RadioButton jouleButton = (RadioButton) findViewById(R.id.radioButton1);
			RadioButton calorieButton = (RadioButton) findViewById(R.id.radioButton2);
			if (text.getText().length() == 0) {
				Toast.makeText(this, "Please enter a valid number",
						Toast.LENGTH_LONG).show();
				return;
			}

			float inputValue = Float.parseFloat(text.getText().toString());
			if (jouleButton.isChecked()) {
				text.setText(String
						.valueOf(convertCalorieToJoule(inputValue)));
			} else {
				text.setText(String
						.valueOf(convertJouleToCalorie(inputValue)));
			}
			// Switch to the other button
			if (calorieButton.isChecked()) {
				calorieButton.setChecked(false);
				jouleButton.setChecked(true);
			} else {
				calorieButton.setChecked(true);
				jouleButton.setChecked(false);
			}
			break;
		}
	}

	// Converts to celsius
	private float convertCalorieToJoule(float calorie) {
		return (calorie*5000/20929);
	}
	
	// Converts to fahrenheit
	private float convertJouleToCalorie(float Joule) {
		return (Joule*4.1858f);
	}
}