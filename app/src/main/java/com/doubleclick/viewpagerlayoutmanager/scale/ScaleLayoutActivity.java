package com.doubleclick.viewpagerlayoutmanager.scale;


import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.ScaleLayoutManager;
import com.doubleclick.viewpagerlayoutmanager.Util;

/**
 * Created by Dajavu on 27/10/2017.
 */

public class ScaleLayoutActivity extends BaseActivity<ScaleLayoutManager, ScalePopUpWindow> {

    @Override
    protected ScaleLayoutManager createLayoutManager() {
        return new ScaleLayoutManager(this, Util.Dp2px(this, 10));
    }

    @Override
    protected ScalePopUpWindow createSettingPopUpWindow() {
        return new ScalePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
