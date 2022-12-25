package de.yapp.animation;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class FrameAnimation extends Activity
{
    private ImageView iv_picture;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        iv_picture = (ImageView) findViewById(R.id.iv_picture);

        iv_picture.setBackgroundResource(R.anim.frames_animation);

        AnimationDrawable frameAnimation = (AnimationDrawable) iv_picture.getBackground();
        frameAnimation.start();
    }
}
