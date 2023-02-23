package com.doubleclick.viewpagerlayoutmanager;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.doubleclick.viewpagerlayoutmanager.carousel.CarouselLayoutActivity;
import com.doubleclick.viewpagerlayoutmanager.circle.CircleLayoutActivity;
import com.doubleclick.viewpagerlayoutmanager.circlescale.CircleScaleLayoutActivity;
import com.doubleclick.viewpagerlayoutmanager.gallery.GalleryLayoutActivity;
import com.doubleclick.viewpagerlayoutmanager.rotate.RotateLayoutActivity;
import com.doubleclick.viewpagerlayoutmanager.scale.ScaleLayoutActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String INTENT_TITLE = "title";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_circle).setOnClickListener(this);
        findViewById(R.id.bt_circle_scale).setOnClickListener(this);
        findViewById(R.id.bt_elevate_scale).setOnClickListener(this);
        findViewById(R.id.bt_gallery).setOnClickListener(this);
        findViewById(R.id.bt_rotate).setOnClickListener(this);
        findViewById(R.id.bt_scale).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_circle:
                startActivity(CircleLayoutActivity.class, v);
                break;
            case R.id.bt_circle_scale:
                startActivity(CircleScaleLayoutActivity.class, v);
                break;
            case R.id.bt_elevate_scale:
                startActivity(CarouselLayoutActivity.class, v);
                break;
            case R.id.bt_gallery:
                startActivity(GalleryLayoutActivity.class, v);
                break;
            case R.id.bt_rotate:
                startActivity(RotateLayoutActivity.class, v);
                break;
            case R.id.bt_scale:
                startActivity(ScaleLayoutActivity.class, v);
                break;
        }
    }

    private void startActivity(Class clz, View view) {
        Intent intent = new Intent(this, clz);
        if (view instanceof AppCompatButton) {
            intent.putExtra(INTENT_TITLE, ((AppCompatButton) view).getText());
        }
        startActivity(intent);
    }
}
