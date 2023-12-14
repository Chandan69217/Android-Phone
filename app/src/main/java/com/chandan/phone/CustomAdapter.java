package com.chandan.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    ArrayList<ContactDetails> contactList;
    Context context;
    private int lastPosition=-1;

    public CustomAdapter(Context context,ArrayList<ContactDetails> contactList){
        this.context = context;
        this.contactList = contactList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_contact_view,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contact_image.setImageResource(contactList.get(holder.getPosition()).getImage());
        holder.contact_name_txt.setText(contactList.get(holder.getPosition()).getContactName());
        holder.contact_number_txt.setText(contactList.get(holder.getPosition()).getContactNumber().substring(3));
        setAnimation(holder.itemView,holder.getPosition());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView contact_image;
        TextView contact_name_txt,contact_number_txt,contact_country_code_txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_image = itemView.findViewById(R.id.contact_image);
            contact_name_txt = itemView.findViewById(R.id.contact_name_txt);
            contact_number_txt = itemView.findViewById(R.id.contact_number_txt);
            contact_country_code_txt = itemView.findViewById(R.id.contact_country_code_txt);
        }
    }

    private void setAnimation(View view,int position){
        if(position>lastPosition) {
            Animation custom_animation = AnimationUtils.loadAnimation(context, R.anim.recy_custom_animation);
            view.setAnimation(custom_animation);
            lastPosition=position;
        }
     }

}
