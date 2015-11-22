package com.bright42.nightmode;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UiModeManager uiManager = (UiModeManager) getSystemService(Context.UI_MODE_SERVICE);
        uiManager.setNightMode(UiModeManager.MODE_NIGHT_AUTO);
    }
}
