package com.ben.sample.architectureexample.activities.common;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ben.sample.architectureexample.config.App;
import com.ben.sample.architectureexample.config.AppComponent;

/**
 * Base activity taking care of the dagger injection for all the activities
 */
public abstract class BaseInjectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(App.get(this).getEdjingAppComponent());
    }

    protected abstract void setupActivityComponent(AppComponent appComponent);
}

