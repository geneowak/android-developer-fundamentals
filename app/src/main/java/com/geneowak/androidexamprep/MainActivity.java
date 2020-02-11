package com.geneowak.androidexamprep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.geneowak.androidexamprep.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // toasts //
        // get app context
        Context context = getApplicationContext();
        // get text you'd like to display
        String text = "Hello Toast";
        // get the duration
        int duration = Toast.LENGTH_SHORT;
        // create the toast object
        Toast toast = Toast.makeText(context, text, duration);
        // display the toast
        toast.show();


    }
}
