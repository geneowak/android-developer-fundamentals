package com.geneowak.androidexamprep;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);


    }

    // toasts //
    public void showToast(View view) {
        // create the toast object
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        // positioning
        // toast.setGravity(Gravity.TOP|Gravity.START, 0,0);
        // display the toast
        toast.show();
        // test out logging an error
        try {
            int age = 1 / 0;
            Log.d(LOG_TAG, "His age is " + age);
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage());
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
