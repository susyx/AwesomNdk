package com.example.suyouxiong.awesomendk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewById = (TextView) findViewById(R.id.hello_ndk);
        viewById.setText(getStringNative());
    }

    static {
        System.loadLibrary("hello-ndk");
    }

    private native String getStringNative();
}
