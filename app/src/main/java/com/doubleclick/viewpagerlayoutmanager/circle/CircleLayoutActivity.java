package com.doubleclick.viewpagerlayoutmanager.circle;


import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.CircleLayoutManager;

/**
 * Created by Dajavu on 25/10/2017.
 */

public class CircleLayoutActivity extends BaseActivity<CircleLayoutManager, CirclePopUpWindow> {

    @Override
    protected CircleLayoutManager createLayoutManager() {
        return new CircleLayoutManager(this);
    }

    @Override
    protected CirclePopUpWindow createSettingPopUpWindow() {
        return new CirclePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
