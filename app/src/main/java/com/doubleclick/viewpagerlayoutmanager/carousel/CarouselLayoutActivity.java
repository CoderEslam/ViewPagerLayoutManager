package com.doubleclick.viewpagerlayoutmanager.carousel;

import com.doubleclick.viewpagerlayoutmanager.BaseActivity;
import com.doubleclick.viewpagerlayoutmanager.CarouselLayoutManager;
import com.doubleclick.viewpagerlayoutmanager.Util;


/**
 * Created by Dajavu on 27/10/2017.
 */

public class CarouselLayoutActivity extends BaseActivity<CarouselLayoutManager, CarouselPopUpWindow> {

    @Override
    protected CarouselLayoutManager createLayoutManager() {
        return new CarouselLayoutManager(this, Util.Dp2px(this, 100));
    }

    @Override
    protected CarouselPopUpWindow createSettingPopUpWindow() {
        return new CarouselPopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
