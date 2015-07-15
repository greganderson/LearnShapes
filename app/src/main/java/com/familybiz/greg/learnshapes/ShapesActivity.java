package com.familybiz.greg.learnshapes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.familybiz.greg.learnshapes.R.drawable.beta_u;


public class ShapesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(android.R.style.Theme_Material);

        final LinearLayout rootLayout = new LinearLayout(this);

        final Integer[] shapeArray = {
                R.drawable.beta_u,
                R.drawable.divide,
                R.drawable.heart,
                R.drawable.infinity,
                R.drawable.ohm,
                R.drawable.pi_l,
                R.drawable.sigma_u,
                R.drawable.triangle
        };

        final RandomItemList<Integer> shapes = new RandomItemList<>(shapeArray);

        rootLayout.setBackground(getDrawable(shapes.nextItem()));

        rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootLayout.setBackground(getDrawable(shapes.nextItem()));
            }
        });

        setContentView(rootLayout);
    }
}
