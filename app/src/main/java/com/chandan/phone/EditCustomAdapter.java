package com.chandan.phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EditCustomAdapter extends RecyclerView.Adapter<EditCustomAdapter.ViewHolder>{


    Context context;
    ArrayList<ContactDetails> contactList;
    int lastPosition = -1;
    EditCustomAdapter(Context context,ArrayList<ContactDetails> contactList){
        this.context = context;
        this.contactList = contactList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(context).inflate(R.layout.edit_custom_contact_view,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.contact_image.setImageResource(contactList.get(holder.getAdapterPosition()).getImage());
        holder.contact_name_txt.setText(contactList.get(holder.getPosition()).getContactName());
        holder.contact_number_txt.setText(contactList.get(holder.getAdapterPosition()).getContactNumber().substring(3));
        if(lastPosition < holder.getPosition()) {
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.recy_custom_animation));
            lastPosition = holder.getPosition();
        }

        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.checkBox.isChecked()){
                    contactList.remove(holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
       return this.contactList.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView contact_image;
        TextView contact_name_txt,contact_number_txt,contact_country_code_txt;
       public CheckBox checkBox;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_image = itemView.findViewById(R.id.contact_image);
            contact_name_txt = itemView.findViewById(R.id.contact_name_txt);
            contact_number_txt = itemView.findViewById(R.id.contact_number_txt);
            contact_country_code_txt = itemView.findViewById(R.id.contact_country_code_txt);
            checkBox = itemView.findViewById(R.id.edit_contact_check_box);
        }
    }
}
