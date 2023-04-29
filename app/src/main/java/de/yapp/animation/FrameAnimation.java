package de.yapp.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class FrameAnimation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        ImageView picture = findViewById(R.id.iv_picture);

        picture.setBackgroundResource(R.drawable.frames_animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) picture.getBackground();
        frameAnimation.start();
    }
}
