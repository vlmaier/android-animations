package de.yapp.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity
{
    private Button b_frameAnimation;
    private Button b_tweenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_frameAnimation = (Button) findViewById(R.id.b_frameAnimation);
        b_tweenAnimation = (Button) findViewById(R.id.b_tweenAnimation);
    }

    public void frameAnimation(View v)
    {
        Intent i = new Intent(MainActivity.this, FrameAnimation.class);
        startActivity(i);
    }

    public void tweenAnimation(View v)
    {
        Intent i = new Intent(MainActivity.this, TweenAnimation.class);
        startActivity(i);
    }

    public void propertyAnimation(View v)
    {
        Intent i = new Intent(MainActivity.this, PropertyAnimation.class);
        startActivity(i);
    }
}
