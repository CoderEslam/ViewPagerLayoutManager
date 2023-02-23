package com.doubleclick.viewpagerlayoutmanager.rotate;


import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.RotateLayoutManager;
import com.doubleclick.viewpagerlayoutmanager.Util;

/**
 * Created by Dajavu on 27/10/2017.
 */

public class RotateLayoutActivity extends BaseActivity<RotateLayoutManager, RotatePopUpWindow> {

    @Override
    protected RotateLayoutManager createLayoutManager() {
        return new RotateLayoutManager(this, Util.Dp2px(this, 10));
    }

    @Override
    protected RotatePopUpWindow createSettingPopUpWindow() {
        return new RotatePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
