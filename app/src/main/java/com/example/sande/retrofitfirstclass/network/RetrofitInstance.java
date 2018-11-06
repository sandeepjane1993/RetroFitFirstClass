package com.example.sande.retrofitfirstclass.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit;
    //https://jsonplaceholder.typicode.com/photos
    public static final String BASE_URL ="https://jsonplaceholder.typicode.com";
    // http://rjtmobile.com/aamir/property-mgmt/pro_mgt_forgot_pass.php?email=aa@aa.com         ..... full url
    public static final String RJT_BASE_URL = "http://rjtmobile.com";

     public static Retrofit getRetrofitInstance()
    {
        if(retrofit == null)
        {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(RJT_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
