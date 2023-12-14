package com.chandan.phone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Home extends AppCompatActivity{
    Toolbar home_toolbar;
    TextView edit_txt;
    TabLayout tabLayout;
    ViewPager home_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findView();
        setSupportActionBar(home_toolbar);

        PhonePageViewerAdapter pageViewerAdapter = new PhonePageViewerAdapter(getSupportFragmentManager());
        home_container.setAdapter(pageViewerAdapter);
        tabLayout.setupWithViewPager(home_container);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(PhoneFragment.onBackPressedListener!=null){
            PhoneFragment.onBackPressedListener.onBackPressed();
        }
    }

    private void findView(){
        home_toolbar = findViewById(R.id.home_toolbar);
        edit_txt = findViewById(R.id.edit_menu);
        tabLayout = findViewById(R.id.tab);
        home_container = findViewById(R.id.home_container);
    }

    public TextView getTextView(){
        return edit_txt;
    }
}
