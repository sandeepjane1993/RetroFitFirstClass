package com.example.sande.retrofitfirstclass.model;

import com.google.gson.annotations.SerializedName;

public class UserDetails {

    @SerializedName("useremail")
    String userEmail;
    @SerializedName("userpassword")
    String userPassword;

    public UserDetails(String userEmail, String userPassword) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
