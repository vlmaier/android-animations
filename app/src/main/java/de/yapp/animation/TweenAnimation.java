package de.yapp.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class TweenAnimation extends Activity implements Animation.AnimationListener
{
    private ImageView iv_picture;
    private Button b_start;
    Animation translate;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        iv_picture = (ImageView) findViewById(R.id.iv_picture);
        iv_picture.setBackgroundResource(R.drawable.frame11);

        translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tween_animation);
        translate.setAnimationListener(this);

        b_start = (Button) findViewById(R.id.b_start);
    }

    public void start(View v)
    {
        iv_picture.startAnimation(translate);
    }

    @Override
    public void onAnimationStart(Animation animation)
    {

    }

    @Override
    public void onAnimationRepeat(Animation animation)
    {

    }

    @Override
    public void onAnimationEnd(Animation animation)
    {
        if (animation == translate)
        {
            iv_picture.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }
}
