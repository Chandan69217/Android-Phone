package com.chandan.phone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

public class PhonePageViewerAdapter extends FragmentPagerAdapter {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    public PhonePageViewerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragmentManager = fm;
        fragmentTransaction = fragmentManager.beginTransaction();
    }
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return  new PhoneFragment();
        }else{
            return new ContactsFragment();
        }
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Phone";
        } else{
            return "Contacts";
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
