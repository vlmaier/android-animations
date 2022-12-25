package de.yapp.animation;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;


public class PropertyAnimation extends Activity
{
    private static final int RED = 0xffFF8080;
    private static final int GREEN = 0xff80ff80;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);

        LinearLayout layout = (LinearLayout) findViewById(R.id.linLayout);
        Button button = (Button) findViewById(R.id.button);

        ObjectAnimator.ofInt(layout, "backgroundColor", RED, GREEN)
                      .setDuration(1000)
                      .start();

        button.animate().rotationY(180).setDuration(1000).start();
    }
}
