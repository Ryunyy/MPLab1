package com.example.lab1mp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Default class for creating mobile application.
 * @author Svyatoslav Sentyurov
 * @version 0.1
 */
public class MainActivity extends AppCompatActivity {

    /**Create method*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}