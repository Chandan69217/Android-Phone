package com.chandan.phone;

public class ContactDetails {
    private int image;
    private String contact_name,contact_number;

    ContactDetails(int image,String contact_name,String contact_number){
        this.image = image;
        this.contact_name = contact_name;
        this.contact_number = contact_number;
    }

    ContactDetails(String contact_name, String contact_number){
        this.image = R.drawable.person;
        this.contact_name = contact_name;
        this.contact_number = contact_number;
    }

    public int getImage(){
        return this.image;
    }
    public String getContactName(){
        return this.contact_name;
    }
    public String getContactNumber(){
        return this.contact_number;
    }

    public void setImage(int image){
        this.image = image;
    }
    public void setContactName(String contact_name){
        this.contact_name = contact_name;
    }
    public void setContactNumber(String contact_number){
        this.contact_number = contact_number;
    }

}
