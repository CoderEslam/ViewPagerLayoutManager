package com.doubleclick.viewpagerlayoutmanager.gallery;


import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.GalleryLayoutManager;
import com.doubleclick.viewpagerlayoutmanager.Util;

/**
 * Created by Dajavu on 27/10/2017.
 */

public class GalleryLayoutActivity extends BaseActivity<GalleryLayoutManager, GalleryPopUpWindow> {

    @Override
    protected GalleryLayoutManager createLayoutManager() {
        return new GalleryLayoutManager(this, Util.Dp2px(this, 10));
    }

    @Override
    protected GalleryPopUpWindow createSettingPopUpWindow() {
        return new GalleryPopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
