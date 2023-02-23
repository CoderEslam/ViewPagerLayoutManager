package com.doubleclick.viewpagerlayoutmanager.circlescale;


import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.CircleScaleLayoutManager;

/**
 * Created by Dajavu on 27/10/2017.
 */

public class CircleScaleLayoutActivity extends BaseActivity<CircleScaleLayoutManager, CircleScalePopUpWindow> {

    @Override
    protected CircleScaleLayoutManager createLayoutManager() {
        return new CircleScaleLayoutManager(this);
    }

    @Override
    protected CircleScalePopUpWindow createSettingPopUpWindow() {
        return new CircleScalePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
