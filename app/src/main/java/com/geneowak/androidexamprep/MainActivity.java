package com.geneowak.androidexamprep;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;
    private Button mZeroButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        mZeroButton = findViewById(R.id.button_zero);

    }

    // toasts //
    public void showToast(View view) {
        // create the toast object
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        // positioning
        // toast.setGravity(Gravity.TOP|Gravity.START, 0,0);
        // display the toast
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        mZeroButton.setBackgroundColor(getColor(R.color.colorAccent));
        // update the color of the button depending on whether the new count is odd or even
        if (mCount % 2 == 0) {
            view.setBackgroundColor(getColor(android.R.color.holo_purple));
        } else {
            view.setBackgroundColor(getColor(android.R.color.holo_green_light));
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    @SuppressLint("SetTextI18n")
    public void resetCount(View view) {
        mCount = 0;
        // set the color to zero
        mZeroButton.setBackgroundColor(getColor(android.R.color.darker_gray));
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
