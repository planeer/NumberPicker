package com.shawnlin.numberpicker.sample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.shawnlin.numberpicker.NumberPicker;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "NumberPicker";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NumberPicker numberPicker = findViewById(R.id.number_picker);

        // Set divider color
        numberPicker.setDividerColorResource(R.color.colorPrimary);

        // Set selected text color
        numberPicker.setSelectedTextColorResource(R.color.colorPrimary);

        // Set selected text size
        numberPicker.setSelectedTextSize(R.dimen.selected_text_size);

        // Set text color
        numberPicker.setTextColorResource(R.color.dark_grey);

        // Set text size
        numberPicker.setTextSize(getResources().getDimension(R.dimen.text_size));

        // Set typeface
        numberPicker.setTypeface(R.string.roboto_light, Typeface.NORMAL);

        // Using string values
        // IMPORTANT! setMinValue to 1 and call setDisplayedValues after setMinValue and setMaxValue
        String[] data = {"Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "BbbbbbbbbbbbbbbbbbbbbbbbbbbbbbBBb", "Cccccccccccccccccccccc", "dddddddddddddddddddddD", "eeeeeeeeeeeeE", "fffffffffffffffffffF", "ggggggggggggggggggggggggggG", "hhhhhhhhhhhhhhhhhhhhhH", "Iiiiiiiiiiiiiiiiiiiiii"};
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(data.length);
        numberPicker.setDisplayedValues(data);
        numberPicker.setValue(7);

        // Set fading edge enabled
        numberPicker.setFadingEdgeEnabled(true);

        // Set scroller enabled
        numberPicker.setScrollerEnabled(true);

        // Set wrap selector wheel
        numberPicker.setWrapSelectorWheel(true);

        // OnClickListener
        numberPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Click on current value");
            }
        });

        // OnValueChangeListener
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                Log.d(TAG, String.format(Locale.US, "oldVal: %d, newVal: %d", oldVal, newVal));
            }
        });
    }

}
