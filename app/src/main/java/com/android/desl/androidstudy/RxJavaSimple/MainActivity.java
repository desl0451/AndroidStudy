package com.android.desl.androidstudy.RxJavaSimple;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.android.desl.androidstudy.R;
import com.android.desl.androidstudy.RxJavaSimple.module.ElementaryFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者:追风小宝
 * 日期: 2019/1/3 21:02
 */
public class MainActivity extends AppCompatActivity {
    @BindView(android.R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.toolBar)
    Toolbar toolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxjava_chapter01_01_06);
        ButterKnife.bind(this);

        setSupportActionBar(toolBar);

        viewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new ElementaryFragment();
                    case 1:
                        return new ElementaryFragment();
                    case 2:
                        return new ElementaryFragment();
                    case 3:
                        return new ElementaryFragment();
                    case 4:
                        return new ElementaryFragment();
                    case 5:
                        return new ElementaryFragment();
                    default:
                        return new ElementaryFragment();
                }
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                switch (position) {
                    case 0:
                        return getString(R.string.RxJavaSimple_Title_Elementary);
                    case 1:
                        return getString(R.string.RxJavaSimple_Title_Map);
                    case 2:
                        return getString(R.string.RxJavaSimple_Title_Zip);
                    case 3:
                        return getString(R.string.RxJavaSimple_Title_Token);
                    case 4:
                        return getString(R.string.RxJavaSimple_Title_Token_Advanced);
                    case 5:
                        return getString(R.string.RxJavaSimple_Title_Cache);
                    default:
                        return getString(R.string.RxJavaSimple_Title_Elementary);
                }
            }

            @Override
            public int getCount() {
                return 6;
            }
        });
        tabLayout.setupWithViewPager(viewPager);
    }
}
