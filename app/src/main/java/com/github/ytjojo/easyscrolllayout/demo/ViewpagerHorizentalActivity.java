package com.github.ytjojo.easyscrolllayout.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/30 0030.
 */

public class ViewpagerHorizentalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_horizental_withheader);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            HashMap<Integer,Fragment> map =new HashMap<>();
            @Override
            public Fragment getItem(int position) {
                Fragment fragment = map.get(position);
                if(fragment != null){

                    return  fragment;
                }
                switch (position){
                    case 0:

                        fragment =   new RecyclerViewFragment();
                        break;
                    case 1:

                        fragment =   new ScrollViewFragment();
                        break;
                    case 2:

                        fragment =   new NestedScrollFragment();
                        break;
                    case 3:

                        fragment =   new WebViewFragment();
                        break;
                }
                map.put(position,fragment);
                return fragment;
            }

            @Override
            public int getCount() {
                return 4;
            }
        });
    }
}
