package com.chandan.phone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Objects;

public class DialPadFragment extends Fragment implements OnBackPressedListener {

    View view;
    Button hideDialPad;
    LinearLayout Symbol_1,Symbol_2,Symbol_3,Symbol_4,Symbol_5,Symbol_6,Symbol_7,Symbol_8,Symbol_9,Symbol_10,Symbol_0,Symbol_12;
    public DialPadFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_dial_pad, container, false);
         findID();
         hideDialPad.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onBackPressed();
                 Toast.makeText(getActivity(),"Clicked",Toast.LENGTH_SHORT).show();
             }
         });
         return view;
    }

    @Override
    public void onBackPressed() {
        getParentFragmentManager().popBackStack();
    }

    private void findID(){
        hideDialPad = view.findViewById(R.id.dial_pad_hide_btn);
        Symbol_1 = view.findViewById(R.id.symbol_1);
        Symbol_2 = view.findViewById(R.id.symbol_2);
        Symbol_3 = view.findViewById(R.id.symbol_3);
        Symbol_4 = view.findViewById(R.id.symbol_4);
        Symbol_5 = view.findViewById(R.id.symbol_5);
        Symbol_6 = view.findViewById(R.id.symbol_6);
        Symbol_7 = view.findViewById(R.id.symbol_7);
        Symbol_8 = view.findViewById(R.id.symbol_8);
        Symbol_9 = view.findViewById(R.id.symbol_9);
        Symbol_10 = view.findViewById(R.id.symbol_10);
        Symbol_0 = view.findViewById(R.id.symbol_0);
        Symbol_12 = view.findViewById(R.id.symbol_12);
    }
}