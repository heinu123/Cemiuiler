package com.sevtinge.cemiuiler.ui;

import androidx.fragment.app.Fragment;
import com.sevtinge.cemiuiler.R;
import com.sevtinge.cemiuiler.ui.base.BaseAppCompatActivity;
import com.sevtinge.cemiuiler.ui.base.SubFragment;

public class GalleryActivity extends BaseAppCompatActivity {

    @Override
    public Fragment initFragment() {
        return new com.sevtinge.cemiuiler.ui.GalleryActivity.GalleryFragment();
    }

    public static class GalleryFragment extends SubFragment {

        @Override
        public int getContentResId() {
            return R.xml.gallery;
        }
    }


}


