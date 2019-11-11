package com.example.chaq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chaquo.python.*;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Python.start(new AndroidPlatform(this));
        Python py = Python.getInstance();
        PyObject result = py.getModule("main").callAttr("test", "one");

        String result_string = result.toString();
    }
}
