package com.song.test.submodule.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.song.test.submodule.child1.Submodule1Util;
import com.song.test.submodule.child2.Submodule2Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submodule1Util.test();
        Submodule2Util.test();
    }
}
