package com.example.sande.retrofitfirstclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sande.retrofitfirstclass.model.PhotoAlbum;
import com.example.sande.retrofitfirstclass.model.UserDetails;
import com.example.sande.retrofitfirstclass.network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText et_email;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_email = findViewById(R.id.et_email);

        Button button = findViewById(R.id.btn_sendemail);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = et_email.getText().toString();
                ApiService apiService = RetrofitInstance.getRetrofitInstance().create(ApiService.class);
                Call<UserDetails> call = apiService.getDetails(email);
                call.enqueue(new Callback<UserDetails>() {
                    @Override
                    public void onResponse(Call<UserDetails> call, Response<UserDetails> response) {

                        UserDetails userDetails = response.body();

                        if(userDetails != null) {
                            Log.i("MainActivity", "onResponse: " + userDetails.getUserEmail());
                        } else {
                            Log.i("MainActivity", "onResponse: " + response.body().toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<UserDetails> call, Throwable t) {

                        Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });



       // Call<List<PhotoAlbum>> call = apiService.getPhotos();

        /*call.enqueue(new Callback<List<PhotoAlbum>>() {
            @Override
            public void onResponse(Call<List<PhotoAlbum>> call, Response<List<PhotoAlbum>> response) {

                //PhotoAlbum photoAlbum = response.body();     In case of object but in this case we have jhsonaraay

                List<PhotoAlbum> myList = response.body();
                Log.i("MainActivity", " In onResponse: " + myList.get(0).getAlbumId() + "\n " + myList.get(0).getImageUrl());
                getListData(myList);
            }

            @Override
            public void onFailure(Call<List<PhotoAlbum>> call, Throwable t) {

                Toast.makeText(MainActivity.this, " " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
*/


    }

    private void getListData(List<PhotoAlbum> myList) {


    }
}
