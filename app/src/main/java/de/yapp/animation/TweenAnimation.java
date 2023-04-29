package de.yapp.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


public class TweenAnimation extends Activity implements Animation.AnimationListener {
    Animation translate;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        picture = findViewById(R.id.iv_picture);
        picture.setBackgroundResource(R.drawable.frame11);

        translate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tween_animation);
        translate.setAnimationListener(this);
    }

    public void start(View v) {
        picture.startAnimation(translate);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == translate) {
            picture.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }
}
