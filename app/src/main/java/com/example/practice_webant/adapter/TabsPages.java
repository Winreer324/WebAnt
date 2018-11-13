package com.example.practice_webant.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.practice_webant.fragment.AbstractTabFragment;
import com.example.practice_webant.fragment.NewFragment;
import com.example.practice_webant.fragment.PopularyFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPages extends FragmentPagerAdapter {
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPages(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int i) {
        return  tabs.get(i);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

//    переключение между табами
    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, NewFragment.getInstance(context));
        tabs.put(1, PopularyFragment.getInstance(context));
    }
}