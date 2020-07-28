package com.example.multiscreen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new NumbersFragment();
        }
        else if (position==1){
           return new FamilyFragment();
        }
        else if (position==2){
           return new ColorsFragment();
        }
        else {
           return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0){
            title="Numbers";
        }
        else if (position==1){
            title="Family";
        }
        else if (position==2){
            title="Colors";
        }
        else {
            title="Phrases";
        }
        return title;
    }
}
