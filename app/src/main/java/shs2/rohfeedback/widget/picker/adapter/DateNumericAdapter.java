package shs2.rohfeedback.widget.picker.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Adapter for numeric wheels. Highlights the current value.
 */
public class DateNumericAdapter extends NumericWheelAdapter {
	// Index of current item
	int currentItem;
	// Index of item to be highlighted
	int currentValue;

	/**
	 * Constructor
	 */
	public DateNumericAdapter(Context context, int minValue, int maxValue, int current) {
		super(context, minValue, maxValue);
		this.currentValue = current;
		setTextSize(17);
	}

	@Override
	protected void configureTextView(TextView view) {
		super.configureTextView(view);
		if (currentItem == currentValue) {
			view.setTextColor(0xFF0000F0);
		}
		view.setTypeface(Typeface.SANS_SERIF);
	}

	@Override
	public View getItem(int index, View cachedView, ViewGroup parent) {
		currentItem = index;
		return super.getItem(index, cachedView, parent);
	}
	
	public void setCurrentItem(int current){
		this.currentValue = current;
	}
}