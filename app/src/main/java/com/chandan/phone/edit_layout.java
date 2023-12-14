package com.chandan.phone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Objects;

public class edit_layout extends AppCompatActivity {
    private Toolbar edit_layout_toolbar;
    RecyclerView recyclerView;
    EditCustomAdapter editCustomAdapter;
    ArrayList<ContactDetails> contactList;
    Button deleteBtn;
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemID = item.getItemId();
        switch (itemID){
            case android.R.id.home:
                            finish();
                            break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_layout);
        saveContact();
        deleteBtn = findViewById(R.id.delete_btn);
        edit_layout_toolbar = findViewById(R.id.edit_layout_toolbar);
        setSupportActionBar(edit_layout_toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Select items");
        recyclerView = findViewById(R.id.edit_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        editCustomAdapter = new EditCustomAdapter(this,contactList);
        recyclerView.setAdapter(editCustomAdapter);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editCustomAdapter.notifyItemRemoved(0);
            }
        });
    }


    private void saveContact(){
        contactList = new java.util.ArrayList<>();
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