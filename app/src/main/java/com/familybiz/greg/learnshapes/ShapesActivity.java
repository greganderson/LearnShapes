package com.familybiz.greg.learnshapes;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class ShapesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material);

        final LinearLayout rootLayout = new LinearLayout(this);
        
        setContentView(rootLayout);
    }
}
