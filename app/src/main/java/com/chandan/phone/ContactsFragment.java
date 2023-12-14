package com.chandan.phone;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactsFragment extends Fragment {

    public ArrayList<ContactDetails> contactList;
    CustomAdapter customAdapter;
    RecyclerView recyclerView;
    View view;

    public ContactsFragment() {
        // Required empty public constructor
        saveContact();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view = inflater.inflate(R.layout.fragment_contacts, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        customAdapter = new CustomAdapter(getContext(),contactList);
        recyclerView.setAdapter(customAdapter);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_option2,menu);
        /*TextView edit_txt = ((Home) getActivity()).getTextView();
        edit_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Contacts",Toast.LENGTH_SHORT).show();
            }
        });*/
        super.onCreateOptionsMenu(menu, inflater);
    }

    public void saveContact(){
        contactList = new ArrayList<>();
        contactList.add(new ContactDetails(R.drawable.person,"Chandan Sharma","+918969893457"));
        contactList.add(new ContactDetails(R.drawable.person,"Vijay Sharma","+919771046631"));
        contactList.add(new ContactDetails(R.drawable.person,"Bindeshwari Sharma","+918084448466"));
        contactList.add(new ContactDetails(R.drawable.person,"Kundan Sharma","+917762815272"));
        contactList.add(new ContactDetails(R.drawable.person,"Urmila Sharma","+917050792426"));
        contactList.add(new ContactDetails(R.drawable.person,"Sumi Kumari","+917903325670"));
        contactList.add(new ContactDetails(R.drawable.person,"Rita Sharma","+919625572361"));
        contactList.add(new ContactDetails(R.drawable.person,"Ajay Sharma","+919818875121"));
        contactList.add(new ContactDetails(R.drawable.person,"Soni Sharma","+917082604362"));
        contactList.add(new ContactDetails(R.drawable.person,"Pravin Sharma","+919540550653"));
        contactList.add(new ContactDetails(R.drawable.person,"Ramesh Sharma","+919931947885"));
        contactList.add(new ContactDetails(R.drawable.person,"Shivani Sharma","+918340399382"));
        contactList.add(new ContactDetails(R.drawable.person,"Usha Devi","+919155059716"));
        contactList.add(new ContactDetails(R.drawable.person,"Ashwini Raniganj","+919546507515"));
        contactList.add(new ContactDetails(R.drawable.person,"Aditya Kumar","+918789687907"));
        contactList.add(new ContactDetails(R.drawable.person,"Kanhaiya Kumar","+916203311780"));
        contactList.add(new ContactDetails(R.drawable.person,"Abhinay Sharma","+917295869090"));
        contactList.add(new ContactDetails(R.drawable.person,"Abhishek Vishwakarma","+919516092699"));
        contactList.add(new ContactDetails(R.drawable.person,"Shobha Devi","+917987513955"));
        contactList.add(new ContactDetails(R.drawable.person,"Kanak Sharma","+919430789256"));
        contactList.add(new ContactDetails(R.drawable.person,"Bitu Kumar","+9188664020640"));
    }
}