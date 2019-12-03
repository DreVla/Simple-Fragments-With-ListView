package com.example.listviewfragment.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.listviewfragment.view.DrugsFragment;
import com.example.listviewfragment.view.PatientsFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                PatientsFragment patientsFragment = new PatientsFragment();
                return patientsFragment;
            case 1:
                DrugsFragment drugsFragment = new DrugsFragment();
                return drugsFragment;
            default:
                return null;
        }
    }
}