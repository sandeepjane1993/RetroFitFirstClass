package com.example.sande.retrofitfirstclass;

import com.example.sande.retrofitfirstclass.model.PhotoAlbum;
import com.example.sande.retrofitfirstclass.model.UserDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/photos")

        //if response is JsonArray

    Call<List<PhotoAlbum>> getPhotos();

    //if response is JsonObject
    //Call<PhotoAlbum> getPhotos();

    @GET("/aamir/property-mgmt/pro_mgt_forgot_pass.php?")

    Call<UserDetails> getDetails(@Query("email") String email);   // for multiple use Body instead of query,  use Multi for image
}
