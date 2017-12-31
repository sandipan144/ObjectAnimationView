package com.chakraborty.sandipan.objectanimationview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.alphaButton)
    void playAlphaAnimation(View view){

    }

    @OnClick(R.id.rotateButton)
    void playRotateAnimation(View view){

    }
    @OnClick(R.id.translateButton)
    void playTranslateAnimation(View view){
        ValueAnimator animator = ObjectAnimator.ofFloat(view, View.TRANSLATION_X,1,200);
        
    }
    @OnClick(R.id.scaleButton)
    void playScaleaAnimation(View view){

    }
    @OnClick(R.id.mixtureButton)
    void playMixtureAnimation(View view){

    }
}
