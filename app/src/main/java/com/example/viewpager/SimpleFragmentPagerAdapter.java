package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class SimpleFragmentPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new MondayFragment();
        }
        else if (position==1){
            return new TuesdayFragment();
        }
        else {
            return new WednesdayFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
